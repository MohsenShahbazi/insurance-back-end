package ir.pt.insurance.global;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


/**
 * Created by Pasha.Gharibi on 12/26/2015.
 */

@Documented
@Constraint(validatedBy = NumericValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Numeric {
    String message() default "{Numeric}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
