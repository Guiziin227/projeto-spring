package com.example.projeto.resources;

import com.example.projeto.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L,"malu","malu@gmail.com","12341234","malu123");
        return ResponseEntity.ok().body(user);
    }
}
