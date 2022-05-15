package it.example.secondMicroservice.controller;

import it.example.secondMicroservice.model.request.UserRequest;
import it.example.secondMicroservice.model.response.UserResponse;
import it.example.secondMicroservice.service.UserService;
import it.example.secondMicroservice.util.Converter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SecondEntryPointController {

    private final UserService userService;

    @GetMapping("secondEndPoint")
    public List<UserResponse> getUserList() {
        return userService.getUserList().stream().map(Converter::converUserToResponse).collect(Collectors.toList());
    }

    @PostMapping("saveUser")
    public void saveUser(@RequestBody @Valid UserRequest user) {
        userService.saveUser(user);
    }

}
