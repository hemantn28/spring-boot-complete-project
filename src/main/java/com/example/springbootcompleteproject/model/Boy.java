package com.example.springbootcompleteproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name= "Boy_India")
public class Boy {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String city;
    private int age;

    public Boy() {
    }

    public Boy(int id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
