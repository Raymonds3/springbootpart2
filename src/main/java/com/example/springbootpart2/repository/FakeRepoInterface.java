package com.example.springbootpart2.repository;

import com.example.springbootpart2.model.User;

public interface FakeRepoInterface {

    User insertUser(long id, String name, String surname);

    User findUserById(int id);

    User deleteUser(int id);
}
