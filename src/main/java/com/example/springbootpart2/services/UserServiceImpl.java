package com.example.springbootpart2.services;

import com.example.springbootpart2.model.User;
import com.example.springbootpart2.repository.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private FakeRepo fakeRepo;

    public String addUser(long id, String name, String surname) {
        User user = fakeRepo.insertUser(id, name, surname);
        return String.format("%s %s was Entered",
                user.getName(), user.getSurname());
    }

    @Cacheable("user")
    public String getUser(long id) {
        User user = fakeRepo.findUserById(id);

        try {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return String.format("Hello %s %s",
                user.getName(), user.getSurname());
    }

    public String removeUser(long id) {
        User user = fakeRepo.deleteUser(id);
        return String.format("%s %s was Deleted",
                user.getName(), user.getSurname());
    }
}
