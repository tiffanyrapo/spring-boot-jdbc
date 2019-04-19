<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>hw</title>
    <link rel="stylesheet" type="text/css" href="/static/css/demo.css">
</head>
<body onload="onLoad()">


<h1>${msg!}</h1>

<form action="/hw" method="post">
    <table border="1">
        <tr>
            <th>姓名</th>
            <th>編號</th>
        </tr>
        <tr>
            <td><input name="name" value="${dept.}"/></td>
            <td></td>
        </tr>
    </table>
</form>
</body>
</html>