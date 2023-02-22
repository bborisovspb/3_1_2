package ru.borisov._3_1_2.services;

import ru.borisov._3_1_2.models.User;

import java.util.List;


public interface UserService {

    List<User> getAllUsers();

    User userInfo(int id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int id);

}
