package com.example.restservice.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public List<User> findAllUsers();

    public User findUser(int id);

    public void createUser(User user);

    public void deleteUser(int id);
    public int updateUser(User user);

}
