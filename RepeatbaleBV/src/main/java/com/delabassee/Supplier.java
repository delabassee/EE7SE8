package com.delabassee;

import javax.inject.Named;


@Named
public class Supplier {
	
    // to check, why validator on return type is needed when using multiple validators on param
    public @CheckCase(CaseMode.UPPER) String order( @MyCheck("VW") @MyCheck("AUDI") @MyCheck("SKODA") String requestedCar) {    
        // do some business stuff here
        return  "OK, an order has been submitted for a " + requestedCar;
    }   
    
}
