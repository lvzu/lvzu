<#import "common/pagination.ftl" as pagination/>

<@pagination.bind page/>
<@pagination.output/>
<br>
<br>
<#list page.results as user>
${user.id}  -  ${user.username} <br>
</#list>

<br>
<@pagination.output/>