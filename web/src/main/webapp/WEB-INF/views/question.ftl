<#import "common/pagination.ftl" as pagination/>

<@pagination.bind page/>
<@pagination.output/>
<br>
<br>
<#list page.results as question>
${question.id}  -  ${question.title} - ${question.journeyId}<br>
</#list>

<br>
<@pagination.output/>