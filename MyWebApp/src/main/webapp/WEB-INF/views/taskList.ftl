
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Task list</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Date</th>
        <th>Task</th>
        <th>Implement</th>
        <th>Deadline</th>

    </tr>
    <#list tasks as task>
        <tr>
            <td><a href="task/${task.id}"a>${task.id}</td>
            <td>${task.date}</td>
            <td>${task.task}</td>
            <td>${task.implementation}</td>
            <td>${task.deadLine}</td>
            <td><a href="/delete/${task.id}">Delete</a></td>
            <td><a href="/edit/${task.id}">Edit</a></td>
        </tr>
    </#list>
</table>
<br>
<a href="/addTask"> Add task</a>
</body>
</html>