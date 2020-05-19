package com.example.springbootpart2.repository;

import com.example.springbootpart2.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class FakeRepo implements FakeRepoInterface {
    private static Map<Long, User> user;

    static{
        user = new HashMap<Long, User>() {
            {
                put((long) 1, new User((long) 1, "Raymond","Serekwane"));
                put((long) 2, new User((long) 2, "Thabo","Surname"));
                put((long) 3, new User((long) 3, "Tom","Moyo"));
                put((long) 4, new User((long) 4, "Ryen","Cooper"));
            }
        };
    }

    public User insertUser(long id, String name, String surname) {
        this.user.put(id, new User(id, name, surname));
        return user.get(id);
    }

    public User findUserById(int id) {
        return this.user.get(id);
    }

    public User deleteUser(int id) {
        return this.user.remove(id);
    }
}
