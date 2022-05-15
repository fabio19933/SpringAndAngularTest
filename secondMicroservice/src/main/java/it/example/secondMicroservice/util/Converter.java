package it.example.secondMicroservice.util;

import it.example.secondMicroservice.model.User;
import it.example.secondMicroservice.model.response.UserResponse;
import org.modelmapper.ModelMapper;

public class Converter {
    private final static ModelMapper MODEL_MAPPER = new ModelMapper();

    public static UserResponse converUserToResponse(User user) {
        return MODEL_MAPPER.map(user, UserResponse.class);
    }
}
