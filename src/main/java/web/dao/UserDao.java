package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void add(User user);
    void delete(long id);
    void edit(User user, long id);
    User getById(long id);
}
