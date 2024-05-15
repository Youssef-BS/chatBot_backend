package com.chatBot.springboot.Controllor;

import com.chatBot.springboot.Entity.User;
import com.chatBot.springboot.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthControllor {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = authService.registerUser(user);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody User user) {
        String email = user.getEmail();
        String password = user.getPassword() ;
        User loggedInUser = authService.loginUser(email, password);
        return new ResponseEntity<>(loggedInUser, HttpStatus.OK);
    }
}
