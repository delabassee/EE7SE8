package com.delabassee;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author davidd
 */

public class BasicCarValidator implements ConstraintValidator<MyCheck, String> {

    private String carType;

    public void initialize(MyCheck constraintAnnotation) {
        this.carType = constraintAnnotation.value();
    }

    public boolean isValid(String object, ConstraintValidatorContext constraintContext) {

        System.out.println("--- MyValidator#isValid invoked with " + carType);
        
        if (object == null)
            return true;
        
        return (!object.toUpperCase().contains(carType));
                
    }

}