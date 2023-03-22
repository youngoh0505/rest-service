package com.example.restservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    // private static List<User> users = new ArrayList<>();

    // private static int usersCount = 3;

    // static {
    // users.add(new User(1, "kosa", new Date(), "pass1", "701010-111111"));
    // users.add(new User(2, "metanet", new Date(), "pass2", "801010-111111"));
    // users.add(new User(3, "naver", new Date(), "pass3", "901010-111111"));
    // }

    public List<User> findAll() {
        return userMapper.findAllUsers();
    }

     public User findOne(int id) {
        return userMapper.findUser(id);
    }

     public void deleteById(int id) {
        userMapper.deleteUser(id);
    }

    public int updateOne(User user){
        return userMapper.updateUser(user);
    }

    public void createOne(User user){
        userMapper.createUser(user);
    }

}
