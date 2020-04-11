import com.brijlab.services.Length;
import com.brijlab.services.QuantityMeasurementException;
import com.brijlab.services.QuantityMeasurementMain;
import com.brijlab.services.UnitComparetor;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class QuantityMeasurementTest {

       QuantityMeasurementMain quantityMeasurement = new QuantityMeasurementMain();
    @Test
    public void givenFeetAndLengthIsZero_WhenCompair_ThenTrue() throws QuantityMeasurementException {
        UnitComparetor unitComparetor = new UnitComparetor(0,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(0,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFeetnull_WhenCompair_ThenFalse() {
        UnitComparetor converterInch = new UnitComparetor(0, Length.FEET);
        quantityMeasurement = new QuantityMeasurementMain();
        try {
           boolean result = quantityMeasurement.compare(converterInch, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, e.type);
        }
    }
    @Test
    public void givenFeetAndFeetReference_WhenCompair_ThenTrue() throws QuantityMeasurementException {
           Double feet = 2.0;
           Double value = feet;
        UnitComparetor unitComparetor = new UnitComparetor(value,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(value,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFeetAndFeet_WhenSameType_ThenTrue() throws QuantityMeasurementException {
        double feet1 = 2,feet2 = 2;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    public void givenFeetAndFeet_WhenSameValue_ThenTrue() throws QuantityMeasurementException {
        double feet1 = 5.0,feet2 = 5.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenInchtAndInch_WhenCompairNull_ThenFalse() throws QuantityMeasurementException {
        UnitComparetor converterInch = new UnitComparetor(0, Length.INCH);
        quantityMeasurement = new QuantityMeasurementMain();
        try {
            boolean result = quantityMeasurement.compare(converterInch, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, e.type);
        }
    }
    @Test
    public void givenInchAndInchReference_WhenCompair_ThenTrue() throws QuantityMeasurementException {
        Double feet = 2.0;
        Double value = feet;
        Double value1 = feet;
        UnitComparetor unitComparetor = new UnitComparetor(value,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(value1,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenInchAndInch_WhenSameType_ThenTrue() throws QuantityMeasurementException {
        double feet1 = 24,feet2 = 24;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenInchAndInch_WhenSameValue_ThenTrue() throws QuantityMeasurementException {
        double feet1 = 60.0,feet2 = 60.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFeetAndInch_WhenZero_ThenTrue() throws QuantityMeasurementException {
        double feet1 = 0.0,feet2 = 0.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFeetAndInch_WhenNotEqulTo1_1_ThenFalse() throws QuantityMeasurementException {
        double feet1 = 1.0,inch = 1.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenInchAndFeet_WhenNotEqulTo1_1_ThenFalse() throws QuantityMeasurementException {
        double feet1 = 1.0,inch = 1.0;
        UnitComparetor unitComparetor = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet1,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenFeetAndInch_When1FeetEqulsTo1Inch_ThenTrue() throws QuantityMeasurementException {
        double feet1 = 1.0,inch = 12.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFeetAndInch_When12InchtEqulsTo1Feet_ThenTrue() throws QuantityMeasurementException {
        double feet1 = 1.0,inch = 12.0;
        UnitComparetor unitComparetor2 = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFeetAndYD_When3FeetEqulsTo1YD_ThenTrue() throws QuantityMeasurementException {
        double feet1 = 3,yard = 1;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(yard,Length.YARD);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFeetAndYD_When1FeetNotEqulsTo1YD_ThenFalse() throws QuantityMeasurementException {
        double feet1 = 1,yard = 1;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(yard,Length.YARD);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenInchAndYD_When1InchNotEqulsTo1YD_ThenFalse() throws QuantityMeasurementException {
        double inch = 1,yard = 1;
        UnitComparetor unitComparetor = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(yard,Length.YARD);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenInchAndYD_When36InchEqulsTo1YD_ThenTrue() throws QuantityMeasurementException {
        double inch = 36,yard = 1;
        UnitComparetor unitComparetor = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(yard,Length.YARD);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenYDAndFeet_When1YDEqulsTo3Feet_ThenTrue() throws QuantityMeasurementException {
        double feet = 3,yard = 1;
        UnitComparetor unitComparetor = new UnitComparetor(feet,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(yard,Length.YARD);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenInchAndCentimeter_When1InchTo5Centimeter_ThenTrue() throws QuantityMeasurementException {
        double inch = 2,centimeter = 5;
        UnitComparetor unitComparetor = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(centimeter,Length.CENTIMETER);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
}
