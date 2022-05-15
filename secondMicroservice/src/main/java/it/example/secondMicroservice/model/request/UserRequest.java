package it.example.secondMicroservice.model.request;

import it.example.secondMicroservice.validation.FirstLetterUpperCase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    @NotNull
    @NotEmpty
    @FirstLetterUpperCase
    private String name;

    @NotNull
    @NotEmpty
    @FirstLetterUpperCase
    private String surname;

}
