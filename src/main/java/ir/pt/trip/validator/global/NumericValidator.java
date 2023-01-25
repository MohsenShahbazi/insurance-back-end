package ir.pt.trip.global;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Pasha.Gharibi on 12/26/2015.
 */

public class NumericValidator implements ConstraintValidator<Numeric, String> {
    @Override
    public boolean isValid(String numeric, ConstraintValidatorContext constraintValidatorContext) {
        if (numeric == null) {
            return true;
        }
        if (numeric.matches("^[0-9]*$")) return true;
        else return false;
    }

    @Override
    public void initialize(Numeric numeric) {

    }
}
