package com.example.springbootpart2.services;

public interface UserService {
    void addUser(long id, String name, String surname);

    String getUser(int id);

    void removeUser(int id);
}
