package com.brijlab.services;

public class QuantityMeasurementMain {

    public boolean compare(UnitComparetor unitComparetor1,UnitComparetor unitComparetor2) throws QuantityMeasurementException {
        if (unitComparetor1 == null || unitComparetor2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, "Null Object");
        return unitComparetor1.equals(unitComparetor2);
    }
}
