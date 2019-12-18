package inc.brocorp.webapp.service;

import inc.brocorp.webapp.dao.UserDao;
import inc.brocorp.webapp.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<Task> showAll() {
        return userDao.showAll();
    }
}
