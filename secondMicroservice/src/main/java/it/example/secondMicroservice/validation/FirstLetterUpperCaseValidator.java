package it.example.secondMicroservice.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FirstLetterUpperCaseValidator implements ConstraintValidator<FirstLetterUpperCase, String> {
    @Override
    public void initialize(FirstLetterUpperCase constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return Character.isUpperCase(value.charAt(0));
    }
}
