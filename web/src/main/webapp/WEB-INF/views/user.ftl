<#import "common/pagination.ftl" as pagination/>

<@pagination.bind page/>
<@pagination.output/>
<br>
<br>
<#list page.results as user>
${user.id}  -  ${user.userName} <br>
</#list>

<br>
<@pagination.output/>