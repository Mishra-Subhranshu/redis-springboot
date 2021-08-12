package com.example.repository;

import com.example.entity.User;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public class UserRepository {

    public static final String KEY = "USER";// TO store data one of the hash

    private RedisTemplate<String,User> redisTemplate;

    // we can not use the Redis Server directly so we can use hash

    private HashOperations hashOperations;

    public UserRepository(RedisTemplate<String, User> redisTemplate) {
        this.redisTemplate = redisTemplate;

        hashOperations = redisTemplate.opsForHash();
    }


    //getting all users
    public Map<Long,User> findAll() {
        return hashOperations.entries(KEY);
    }

    //getting users by id

    public User findById(long id) {
        return (User)hashOperations.get(KEY, id);
    }

    //adding an user to redis database

    public User addUser(User user) {
        hashOperations.put(KEY,user.getId(),user);
        return user;
    }

    //update an user

    public User update(User user) { return addUser(user);
    }

    //delete an user

    public void deleteUser(long id) {

       hashOperations.delete(KEY,id);

    }
}
