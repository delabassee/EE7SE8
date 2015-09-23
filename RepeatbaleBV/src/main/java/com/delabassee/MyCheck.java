package com.delabassee;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author davidd
 */

@Target( { METHOD, FIELD, TYPE, ANNOTATION_TYPE , PARAMETER})
@Retention(RUNTIME)
@Repeatable(value = MyChecks.class) // type of the container annotation
@Constraint(validatedBy = BasicCarValidator.class)
public @interface MyCheck {

    String message() default "This type is temporaly unavailable!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
    String value();
    
}




