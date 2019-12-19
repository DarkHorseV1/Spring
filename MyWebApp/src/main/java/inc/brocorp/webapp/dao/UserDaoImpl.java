package inc.brocorp.webapp.dao;

import inc.brocorp.webapp.entity.Task;
import inc.brocorp.webapp.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public List<Task> showAll() {
        String sql = "SELECT * FROM taskList.tasklist";
        return jdbcTemplate.query(sql, new TaskMapper());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM tasklist.tasklist WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void create(Task task) {
        String sql = "INSERT INTO tasklist.tasklist(id, date, task, implementation, deadline) " +
                "VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, task.getId(),
                task.getDate(), task.getTask(),
                task.getImplementation(), task.getDeadLine());
    }

    @Override
    public void update(Task task) {
        String sql = "UPDATE tasklist.tasklist SET date=?, task=?, implementation=?, deadline=? WHERE id=?";
        jdbcTemplate.update(sql, task.getId(),
                task.getDate(), task.getTask(),
                task.getImplementation(), task.getDeadLine());
    }

    @Override
    public Task getById(int id) {
        String sql = "SELECT * FROM tasklist.tasklist WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new TaskMapper(), id);
    }
}
