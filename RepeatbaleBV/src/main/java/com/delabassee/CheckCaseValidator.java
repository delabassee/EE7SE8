package com.delabassee;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CheckCaseValidator implements ConstraintValidator<CheckCase, String> {

    private CaseMode caseMode;

    public void initialize(CheckCase constraintAnnotation) {
        this.caseMode = constraintAnnotation.value();
    }

    public boolean isValid(String object, ConstraintValidatorContext constraintContext) {

        return true;
        
        /*if (object == null)
            return true;
        
        if (caseMode == CaseMode.LOWER) {
            return object.equals(object.toUpperCase());
        }
        else {
            return object.equals(object.toLowerCase());
        }*/
    }

}