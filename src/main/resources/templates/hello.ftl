<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>FreeMarker</title>
    <script src="/static/js/demo.js"></script>
    <link rel="stylesheet" type="text/css" href="/static/css/demo.css">
</head>
<body>

<#assign name=1>
<#assign name++>
<h1>${name}</h1>

<h1>${msg!}</h1>
<#if Session.userid?exists>
    ${Session.userid}
<#else>
    <div>no session</div>
</#if>
<form action="/form-test" method="post">
    <table border="1">
        <tr>
            <th>姓名</th>
            <th>編號</th>
        </tr>
        <tr>
            <td><input name="name" value="${city.name!}"/></td>
            <td><input name="id" value="${city.id!}"/></td>
        </tr>
        <tr>
            <td>
                <button type="submit">Submit</button>
            </td>
        </tr>
    </table>
</form>

<#if list??>
    <#list list as city>
        <div>${city.name}</div>
    </#list>
</#if>
<#include "footer.ftl">
</body>
</html>