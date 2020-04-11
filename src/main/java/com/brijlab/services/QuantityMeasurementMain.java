package com.brijlab.services;

public class QuantityMeasurementMain {

    // add compare method to check override equals method
    public boolean compare(UnitComparetor unitComparetor1,UnitComparetor unitComparetor2) throws QuantityMeasurementException {
        if (unitComparetor1 == null || unitComparetor2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, "Null Object");
        return unitComparetor1.equals(unitComparetor2);
    }
    // Addition of two objects
    public double addition(UnitComparetor unitComparetor, UnitComparetor unitComparetor2) {
        return unitComparetor.getValue()+unitComparetor2.getValue();
    }
}
