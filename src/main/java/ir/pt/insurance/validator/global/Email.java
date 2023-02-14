package ir.pt.insurance.validator.global;

/**
 * Created by Pasha.Gharibi on 11/30/2015.
 */

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EmailValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {
    String message() default "{Email}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
