<html>
<head>
    <title>Users</title>
</head>
    <body>
        <ul>
            <#list users as user>
                <li>${user.name} age: ${user.age}</li>
            </#list>
        </ul>
    </body>
</html>