package com.example.restservice.user;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    public List<Post> findAllPost();
    public Post findOnePost(int id);
    public void CreatePost(Post post);
    public void UpdatePost(Post post);
    public void DeletePost(int id);
}
