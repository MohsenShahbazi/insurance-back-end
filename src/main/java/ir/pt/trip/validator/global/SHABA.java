package ir.pt.trip.global;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


/**
 * Created by Pasha.Gharibi on 12/26/2015.
 */

@Documented
@Constraint(validatedBy = SHABAValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SHABA {
    String message() default "{Shaba}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
