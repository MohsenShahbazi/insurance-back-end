package ir.pt.trip.global;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Pasha.Gharibi on 12/26/2015.
 */

public class CustomDateTimeValidator implements ConstraintValidator<CustomDateTime, String> {
    @Override
    public boolean isValid(String customDateTime, ConstraintValidatorContext constraintValidatorContext) {
        if (customDateTime == null || customDateTime.isEmpty()) {
            return true;
        }
        //if (customDateTime.matches("\\d{10}")) return true;
        if (customDateTime.length() == 14) return true;
        else return false;
    }

    @Override
    public void initialize(CustomDateTime customDateTime) {

    }
}
