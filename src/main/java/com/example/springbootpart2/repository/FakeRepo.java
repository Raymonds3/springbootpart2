package com.example.springbootpart2.repository;

import com.example.springbootpart2.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FakeRepo implements FakeRepoInterface {

    public static HashMap<Long, User> users;
    static{
        users = new HashMap<Long, User>() {
            {
                put((long) 1, new User(1, "Raymond", "Serekwane"));
                put((long) 2, new User(2, "Thabo", "Surname"));
                put((long) 3, new User(3, "Tom", "Moyo"));
                put((long) 4, new User(4, "Ryen", "Cooper"));
            }
        };
    }

    public User insertUser(long id, String name, String surname) {
        this.users.put(id, new User(id, name, surname));
        return users.get(id);
    }

    public User findUserById(long id) {
        return this.users.get(id);
    }

    public User deleteUser(long id) {
        return this.users.remove(id);
    }
}
