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
@Repeatable(CheckCars.class) // type of the container annotation
@Constraint(validatedBy = CarValidator.class)
public @interface CheckCar {

    String message() default "Validation failed!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
    String value();
    
}




