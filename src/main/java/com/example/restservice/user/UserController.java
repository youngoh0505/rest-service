package com.example.restservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

     @GetMapping("/users/{id}")
     public User retrieveUser(@PathVariable int id){
        return service.findOne(id);
    }

    // if(user == null){
    // throw new UserNotFoundException(String.format("ID[%s] not found", id));
    // }

    // return EntityModel.of(user,
    // linkTo(methodOn(UserController.class).retrieveAllUsers()).withRel("all-users"));
    // }

     @DeleteMapping("/users/{id}")
     public void deleteUser(@PathVariable int id){
        service.deleteById(id);
    }

    @PostMapping("/users/update")
    public int updateUser(@RequestBody User user){
        System.out.println(user.toString());
        return service.updateOne(user);
    }

    @PostMapping("/users/create")
    public void createUser(@RequestBody User user){
        service.createOne(user);
    }


}
