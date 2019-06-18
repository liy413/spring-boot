<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>freemarker</title>
</head>
<body>
<table border="1">
    <tr>
        <td>编号</td>
        <td>姓名</td>
    </tr>
    <#list users as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
        </tr>
    </#list>
</table>

</body>
</html>