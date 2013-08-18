<#if page??>
    <#assign data = page />
    <@url/>
</#if>

<#--
 * Bind pagination data to the current data set these macros are using.
-->
<#macro bind paginationData>
    <#assign data = paginationData />
    <@url/>
</#macro>

<#--
 * Outputs the first page link
-->
<#macro first>
    <#if (data.pageNo < 1)>
        <#local classAttr = "class=\"disabled\"" />
    <#else>
        <#local classAttr = "" />
    </#if>
    <#local text = "First"/>
    <@page 1, text, classAttr/>
</#macro>

<#--
 * Outputs the last page link
-->
<#macro last>
    <#if (data.pageNo >= data.totalPages)>
        <#local classAttr = "class=\"disabled\"" />
    <#else>
        <#local classAttr = "" />
    </#if>
    <#local text = "Last"/>
    <@page data.totalPages, text, classAttr/>
</#macro>

<#--
 * Outputs the next page link
-->
<#macro next>
    <#if (data.pageNo >= data.totalPages)>
        <#local pageNo = data.pageNo />
        <#local classAttr = "class=\"disabled\"" />
    <#else>
        <#local pageNo = data.pageNo + 1 />
        <#local classAttr = "" />
    </#if>
    <#local text = "Next"/>
    <@page pageNo, text, classAttr/>
</#macro>

<#--
 * Outputs the previous page link
-->
<#macro previous>
    <#if (data.pageNo <= 1)>
        <#local pageNo = data.pageNo />
        <#local classAttr = "class=\"disabled\"" />
    <#else>
        <#local pageNo = data.pageNo - 1 />
        <#local classAttr = "" />
    </#if>
    <#local text = "Previous"/>
    <@page pageNo, text, classAttr/>
</#macro>

<#--
 * Outputs the page numbers and links
 *
 * @param maxPages (Optional) The maximum number of page links to show
 * @param separator (Optional) The seperator between page links
-->
<#macro numbers maxPages = 9 separator = " | ">
    <#local pagesBefore = (maxPages / 2)?floor />
    <#local pagesAfter = (maxPages / 2)?floor />
    <#if maxPages % 2 == 0>
        <#local pagesBefore = pagesBefore - 1 />
    </#if>
    <#local pageNumMin = data.pageNo - pagesBefore />

    <#local pageNumMax = data.pageNo + pagesBefore />

    <#if (pageNumMin < 0)>
        <#local pageNumMax = pageNumMax + (1 - pageNumMin) />
        <#local pageNumMin = 1 />
    </#if>

    <#if (pageNumMax > data.totalPages)>
        <#local pageNumMin = pageNumMin - (pageNumMax - data.totalPages) />
        <#local pageNumMax = data.totalPages />
        <#if (pageNumMin < 1)>
            <#local pageNumMin = 1 />
        </#if>
        <#if (pageNumMax < 1)>
            <#local pageNumMax = 1 />
        </#if>
    </#if>
    <#list pageNumMin..pageNumMax as pageNo>

        <#if pageNo == data.pageNo>
            <#local classAttr = "class=\"selected\"" />
        <#else>
            <#local classAttr = "" />
        </#if>
        <@page pageNo, "", classAttr/><#if pageNo_has_next>${separator}</#if>
    </#list>
</#macro>

<#--
 * Outputs a link to a specific page.
 *
 * @param pageNo To page number ot link to
 * @param text (Optional) The link text (Defaults to page number if not set)
 * @param attributes (Optional) Any HTML attributes to add to the element
-->
<#macro page pageNo text = "" attributes = "">

    <#if text == "">
        <#local text = pageNo?string />
    </#if>
    <#if (attributes != "" && attributes?starts_with(" ") == false)>
        <#local attributes = " " + attributes />
    </#if>

    <#local purl=pageTag+"="+pageNo?string/>
    <#local localPURL = paginationURL/>
    <#if localPURL?length==0>
        <#local localPURL=purl/>
    <#else>
        <#local localPURL=localPURL+purl/>
    </#if>

    <a href="?${localPURL}"${attributes}>${text?html}</a>
</#macro>

<#macro url pageTag="p">
    <#if pageTag?trim == "">
        <#assign pageTag = "p"/>
    <#else>
        <#assign pageTag = pageTag/>
    </#if>
    <#local queryString=request.queryString/>
    <#local buffer=""/>

    <#if queryString?length == 0>
        <#return />
    </#if>

    <#list queryString?split("&") as one>
        <#if !one?starts_with(pageTag + "=")>
            <#local buffer=buffer+one+"&"/>
        </#if>
    </#list>

    <#assign paginationURL = buffer/>
</#macro>

<#--
 * Outputs the current page number and the total pages
-->
<#macro counter>
    <#if data.totalPages == 0>
        <#local totalPages = 1 />
    <#else>
        <#local totalPages = data.totalPages />
    </#if>
    ${data.pageNo} of ${totalPages}
</#macro>

<#macro output>
    <@pagination.counter/> <@pagination.first/> <@pagination.previous/> <@pagination.numbers/> <@pagination.next/> <@pagination.last/>
</#macro>