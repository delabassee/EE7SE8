package com.delabassee;

import javax.inject.Named;

@Named
public class Supplier {
	
    // to check, why validator on return type is needed when using multiple validators on param
    public @CheckCase(CaseMode.UPPER) String order( @CheckCar("VW") @CheckCar("AUDI") @CheckCar("SKODA")  Car requestedCar) {    
        // do some business stuff here
        return  "OK, an order has been submitted for a " + requestedCar.brand  + " " +requestedCar.model +" ("+ requestedCar.serial +")";
    }   
    
}
