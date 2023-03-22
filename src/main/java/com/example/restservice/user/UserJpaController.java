package com.example.restservice.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/jpa")
public class UserJpaController {

    // @Autowired
    // private UserRepository userRepository;

    @Autowired
    private UserService userService;

    // @Autowired
    // private PostRepository postRepository;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userService.findAll();
    }

    // @GetMapping("/users/{id}")
    // public EntityModel<User> findUserById(@PathVariable int id) {
    // Optional<User> user = userRepository.findById(id);

    // if (!user.isPresent()) {
    // throw new UserNotFoundException(String.format("ID[%s] not found", id));
    // }

    // return EntityModel.of(user.get(),
    // linkTo(methodOn(UserController.class).retrieveAllUsers()).withRel("all-users"));
    // }

    // @DeleteMapping("/users/{id}")
    // public void deleteUser(@PathVariable int id) {
    // userRepository.deleteById(id);
    // }

    // @PostMapping("/users")
    // public ResponseEntity<User> createUser(@RequestBody User user) {
    // User saveUser = userRepository.save(user);

    // URI location =
    // ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveUser.getId())
    // .toUri();

    // return ResponseEntity.created(location).build();
    // }

    // @GetMapping("/users/{id}/posts")
    // public List<Post> retrieveAllPostsByUser(@PathVariable int id) {
    // Optional<User> user = userRepository.findById(id);

    // if (!user.isPresent()) {
    // throw new UserNotFoundException(String.format("ID[%s] not found", id));
    // }

    // return user.get().getPostList();

    // }

    // @PostMapping("/users/{id}/posts")
    // public ResponseEntity<Post> createPost(@PathVariable int id, @RequestBody
    // Post post) {
    // post.setUser(userRepository.getById(id));
    // Post savePost = postRepository.save(post);

    // URI location =
    // ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savePost.getId())
    // .toUri();

    // return ResponseEntity.created(location).build();

    // }
}
