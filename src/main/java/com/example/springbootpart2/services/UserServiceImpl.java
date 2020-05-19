package com.example.springbootpart2.services;

import com.example.springbootpart2.model.User;
import com.example.springbootpart2.repository.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private FakeRepo fakeRepo;

    public void addUser(long id, String name, String surname) {
        User user = fakeRepo.insertUser(id, name, surname);
        String Name = user.getName() + " " + user.getSurname()+ " was Entered";
        System.out.println("\n"+Name);
    }

    @Cacheable("user")
    public String getUser(int id) {
        User user = fakeRepo.findUserById(id);
        String find = "Hello "+ user.getName()+" "+user.getSurname();

        try {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return find;
    }

    public void removeUser(int id) {
        User user = fakeRepo.deleteUser(id);
        String delete = user.getName()+" "+user.getSurname()+" was Deleted";
        System.out.println("\n"+delete);
    }
}
