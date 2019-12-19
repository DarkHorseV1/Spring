package inc.brocorp.webapp.service;

import inc.brocorp.webapp.entity.Task;

import java.util.List;

public interface UserService {

    List<Task> showAll();

    void delete(int id);

    void create(Task task);

    void update(Task task);

    Task getById(int id);
}
