package com.example.entity;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;



public class User implements Serializable {


    private long id;
    private String name;
    private long salary;

    public User() {
    }

    public User(Long id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
