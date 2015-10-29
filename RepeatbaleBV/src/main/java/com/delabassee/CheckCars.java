package com.delabassee;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

/**
 *
 * @author davidd
 */

@Target( { METHOD, FIELD, TYPE, ANNOTATION_TYPE , PARAMETER })
@Retention(RUNTIME)
public @interface CheckCars {
    CheckCar[] value() default{}; ;
}