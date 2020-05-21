package com.example.springbootpart2.services;

public interface UserService {
    String addUser(long id, String name, String surname);

    String getUser(long id);

    String removeUser(long id);
}
