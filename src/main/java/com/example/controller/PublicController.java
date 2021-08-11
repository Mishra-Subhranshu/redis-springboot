package com.example.controller;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class PublicController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/post")
    public User addUser(@RequestBody User user) {
        return userRepository.addUser(user);
    }

    @GetMapping("/all")
    public Map<Long, User> all() {
        return userRepository.findAll();
    }

//    @GetMapping("/add/{id}/{name}")
//    public User add(@PathVariable("id") final String id,
//                    @PathVariable("name") final String name) {
//        userRepository.save(new User(id, name, 20000L));
//        return userRepository.findById(id);
//    }
    @GetMapping("/all/{id}")
    public User findById(@PathVariable long id) {
        return userRepository.findById(id);
    }

    @GetMapping("/update")
    public User update(User user) {
        return userRepository.update(user);
    }

//    @GetMapping("/update/{id}/{name}")
//    public User update(@PathVariable("id") final String id,
//                       @PathVariable("name") final String name) {
//        userRepository.update(new User(id, name, 1000L));
//        return userRepository.findById(id);
//    }
//
//    @GetMapping("/delete/{id}")
//    public Map<String, User> delete(@PathVariable("id") final String id) {
//        userRepository.delete(id);
//        return all();
//    }
}
