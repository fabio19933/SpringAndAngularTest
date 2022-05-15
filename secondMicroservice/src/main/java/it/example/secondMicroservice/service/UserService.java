package it.example.secondMicroservice.service;

import it.example.secondMicroservice.model.User;
import it.example.secondMicroservice.model.request.UserRequest;
import it.example.secondMicroservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();

    }

    public void saveUser(UserRequest user) {
        var modelMapper = new ModelMapper();
        userRepository.save(modelMapper.map(user, User.class));
    }
}
