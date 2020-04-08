package com.brijlab.services;

public class QuantityMeasurementMain {

    private int inch = 12;
    public Boolean checkQuantity(int fit,int inches){
        if (fit == inches/inch)
            return true;
        else if (inches == fit*inch)
            return true;
        else
            return false;
    }

}
