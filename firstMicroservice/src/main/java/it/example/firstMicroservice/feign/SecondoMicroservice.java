package it.example.firstMicroservice.feign;

import it.example.firstMicroservice.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "secondMicroservice")
public interface SecondoMicroservice {

    @GetMapping("api/secondEndPoint")
    List<User> secondEndPoint();
}
