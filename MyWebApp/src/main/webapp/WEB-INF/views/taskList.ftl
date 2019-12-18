<html>
<head>
    <title>Tasks</title>
</head>
    <body>
        <ul>
            <#list tasks as task>
                <li>${task.id}  ${task.date} ${task.task} ${task.implementation} ${task.deadLine}</li>
            </#list>
        </ul>
    </body>
</html>