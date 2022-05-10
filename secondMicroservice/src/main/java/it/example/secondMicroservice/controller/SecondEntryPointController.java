package it.example.secondMicroservice.controller;

import it.example.secondMicroservice.model.User;
import it.example.secondMicroservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SecondEntryPointController {

    private final UserService userService;

    @GetMapping("secondEndPoint")
    public List<User> getUserList() {
        return userService.getUserList();
    }
    @PostMapping("saveUser")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

}
