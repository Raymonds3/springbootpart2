package com.example.springbootpart2.model;

public class User {
    private long Id;
    private static String name;
    private static String surname;

    public User(Long id, String name, String surname) {
        super();
        Id = id;
        this.name = name;
        this.surname = surname;
    }

    public long getId() { return Id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }

    public void setId(long id) { Id = id; }
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
}
