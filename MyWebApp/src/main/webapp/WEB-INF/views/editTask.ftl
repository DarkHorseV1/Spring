<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
</head>
<body>

<form name="task" action="/updateTask" method="post">
    <p>Id</p>
    <input title="id" type="text" name="id" value="${task.id}">
    <p>Date</p>
    <input title="date" type="text" name="date" value="${task.date}">
    <p>Task</p>
    <input title="task" type="text" name="task" value="${task.task}">
    <p>Impl</p>
    <input title="Impl" type="text" name="implementation" value="${task.implementation}">
    <p>Deadline</p>
    <input title="deadline" type="text" name="deadLine" value="${task.deadLine}">
    <input type="submit" value="OK">
</form>

</body>
</html>