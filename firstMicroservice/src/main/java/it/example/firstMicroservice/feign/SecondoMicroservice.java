package it.example.firstMicroservice.feign;

import it.example.firstMicroservice.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient(value = "secondMicroservice",url = "http://localhost:8081")
//todo create variable to change between local and docker
@FeignClient(value = "secondMicroservice",url = "http://secondMicroservice:8081")
public interface SecondoMicroservice {

    @GetMapping("api/secondEndPoint")
    List<User> secondEndPoint();
}
