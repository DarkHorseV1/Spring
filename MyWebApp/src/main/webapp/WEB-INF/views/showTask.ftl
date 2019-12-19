<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Task</title>
</head>
<body>
<h1>Task #${task.id}</h1>
<table>
    <tr>
        <td>Date</td>
        <td>${task.date}</td>
    </tr>
    <tr>
        <td>Task</td>
        <td>${task.task}</td>

    </tr>
    <tr>
        <td>Impl</td>
        <td>${task.implementation}</td>

    </tr>
    <tr>
        <td>Deadline</td>
        <td>${task.deadLine}</td>

    </tr>
</table>
<br>
<a href="/tasks">Back</a>
</body>
</html>