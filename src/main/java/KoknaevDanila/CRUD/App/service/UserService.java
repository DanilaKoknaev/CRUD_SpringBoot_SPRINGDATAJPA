package KoknaevDanila.CRUD.App.service;

import KoknaevDanila.CRUD.App.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(long id);

    void deleteUser(long id);
}
