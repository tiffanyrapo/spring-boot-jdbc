<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>FreeMarker</title>
    <script src="/static/js/demo.js"></script>
    <link rel="stylesheet" type="text/css" href="/static/css/demo.css">
</head>
<body>
<#if list??>
    <#list list as city>
        <div>${city.name}</div>
    </#list>
</#if>
</body>
</html>