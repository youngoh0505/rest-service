package com.example.restservice.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    private PostService postService;

    public PostController(PostService service) {
        this.postService = service;
    }

    @PostMapping("/post/{id}")
    public List<Post> retrieveAllPostsByUser(@PathVariable int id){
        return postService.findAll(id);
    }

    @PostMapping("/post/create/{id}")
    public void createPost(@PathVariable int id, @RequestBody Post post){
        post.setUser_id(id);
        postService.createPost(post);

    }

}

