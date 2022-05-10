package it.example.firstMicroservice.controller;

import it.example.firstMicroservice.feign.SecondoMicroservice;
import it.example.firstMicroservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FirstEntryPointController {

    @Autowired
    private SecondoMicroservice secondoMicroservice;

    @GetMapping(value = "getListUser", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> firstEndPoint() {
        return secondoMicroservice.secondEndPoint();
    }

}
