package com.brijlab.services;

public enum Length {
    FEET(  12), INCH(1 ),YARD (36),
    CENTIMETER(0.4),GALLON(3.78),LITRE(1),
    ML(0.001),KILOGRAMS(1),GRAM(0.001),TONNE(1000),;

    public final double value;

    Length(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
