package com.delabassee;
/**
 *
 * @author davidd
 */
public class Car {
    String brand;
    String model;
    String serial;


    public Car(String brand, String model, String serial) {
        this.brand = brand;
        this.model = model;
        this.serial = serial;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    
    public String getSerial() {
        return serial;
    }

    
}
