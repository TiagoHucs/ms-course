package com.example.hruser.resources;

import com.example.hruser.entities.User;
import com.example.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User usr = userRepository.findById(id).get();
        return ResponseEntity.ok(usr);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email){
        User usr = userRepository.findByEmail(email);
        return ResponseEntity.ok(usr);
    }


}

