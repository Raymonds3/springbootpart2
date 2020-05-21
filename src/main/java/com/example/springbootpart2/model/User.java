package com.example.springbootpart2.model;

public class User {
    private long Id;
    private String Name;
    private String Surname;

    protected User(){
    }

    public User(long id, String name, String surname) {
        Id = id;
        Name = name;
        Surname = surname;
    }

    public long getId() { return Id; }
    public String getName() { return Name; }
    public String getSurname() { return Surname; }

    public void setId(long id) { this.Id = id; }
    public void setName(String name) { this.Name = name; }
    public void setSurname(String surname) { this.Surname = surname; }
}