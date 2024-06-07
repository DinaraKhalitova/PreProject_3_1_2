package org.example.preproject_3_1_2.dao;

import org.example.preproject_3_1_2.model.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    void saveUser(User user);

    User getUser(long id);

    void updateUser(User user);

    void deleteUser(User user);

}
