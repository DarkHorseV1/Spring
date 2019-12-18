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
        String sql= "SELECT * FROM taskList.tasklist";
        return jdbcTemplate.query(sql, new TaskMapper());
    }
}
