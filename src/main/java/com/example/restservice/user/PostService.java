package com.example.restservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostMapper postMapper;

    public List<Post> findAll(int id){
        return postMapper.findAllPostsByUserId(id);
    }

    public void createPost(Post post){
        postMapper.createPost(post);
    }

}
