package com.brijlab.services;

import java.io.IOException;
import java.util.Objects;

public class UnitComparetor {
    private double value;

    public UnitComparetor( double value, Length length) {
        this.value = compare(value, length);
    }

    public double compare(double value,Length length){
        return value * length.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitComparetor that = (UnitComparetor) o;
        return Double.compare(that.value, value) == 0;
    }
}
