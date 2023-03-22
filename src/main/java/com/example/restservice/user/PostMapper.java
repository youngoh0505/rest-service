package com.example.restservice.user;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    public List<Post> findAllPostsByUserId(int id);
    public void createPost(Post post);

}
