package inc.brocorp.webapp.mapper;


import inc.brocorp.webapp.entity.Task;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskMapper implements RowMapper<Task> {

    @Override
    public Task mapRow(ResultSet resultSet, int i) throws SQLException {
        Task task = new Task();
        task.setId(resultSet.getInt("id"));
        task.setDate(resultSet.getString("date"));
        task.setTask(resultSet.getString("task"));
        task.setImplementation(resultSet.getString("implementation"));
        task.setDeadLine(resultSet.getString("deadLine"));
        return task;
    }
}
