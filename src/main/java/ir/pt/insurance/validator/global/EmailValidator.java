package ir.pt.insurance.validator.global;

/**
 * Created by amin on 10/31/2015.
 */

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//@Component("emailValidator")
public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String
            EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private Pattern pattern;
    private Matcher matcher;

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }


    @Override
    public void initialize(Email email) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext ctx) {
        // TODO Auto-generated method stub
        if (email == null) {
            return true;
        }
        if (email.isEmpty()) {
            return true;
        }
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
