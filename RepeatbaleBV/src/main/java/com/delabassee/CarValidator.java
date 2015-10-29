package com.delabassee;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author davidd
 */

public class CarValidator implements ConstraintValidator<CheckCar, Car> {


    private String carBrand;

    public void initialize(CheckCar constraintAnnotation) {
        this.carBrand = constraintAnnotation.value();
    }

   
    public boolean isValid(Car object, ConstraintValidatorContext constraintContext) {

        System.out.println("--- CarValidator#isValid invoked with " + carBrand + " on " + object.brand);
        
        if (object == null)
            return true;
        
        return (!object.getBrand().toUpperCase().contains(carBrand));
                
    }

}