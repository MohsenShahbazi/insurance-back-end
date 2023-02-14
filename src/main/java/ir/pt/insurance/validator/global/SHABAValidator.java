package ir.pt.insurance.global;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Pasha.Gharibi on 12/26/2015.
 */

public class SHABAValidator implements ConstraintValidator<SHABA, String> {
    @Override
    public void initialize(SHABA shaba) {

    }

    @Override
    public boolean isValid(String shaba, ConstraintValidatorContext constraintValidatorContext) {
        String SHABA_PATTERN = "^IR\\d{24}$";
        Pattern pattern = Pattern.compile(SHABA_PATTERN);
        Matcher matcher;
        if (shaba == null || shaba.isEmpty()) {
            return true;
        }
        if (shaba.length() == 26) {
            matcher = pattern.matcher(shaba);
            return matcher.matches();

        } else {
            return false;
        }
    }
}
