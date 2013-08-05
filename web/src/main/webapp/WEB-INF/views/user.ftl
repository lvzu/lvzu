<#include "html.ftl">
<@html title="用户列表页">

<#list users as user>
    ID:${user.id} -- Name:${user.username}<br>
</#list>
<br>
${pagination.toString()}


<a href="./images/t.jpg">adsf</a>
</@html>