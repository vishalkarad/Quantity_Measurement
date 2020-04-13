import com.brijlab.services.Length;
import com.brijlab.services.QuantityMeasurementException;
import com.brijlab.services.QuantityMeasurementMain;
import com.brijlab.services.UnitComparetor;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

       QuantityMeasurementMain quantityMeasurement = new QuantityMeasurementMain();
    @Test
    public void givenFeetAndFeetIsZero_WhenCompair_ThenTrue() throws QuantityMeasurementException {
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
    @Test
    public void givenFeetAndFeet_WhenSameValue_ThenTrue() throws QuantityMeasurementException {
        double feet1 = 5.0,feet2 = 5.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenInchtAndInch_WhenCompairNull_ThenFalse()  {
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
        double inch = 24,inch1 = 24;
        UnitComparetor unitComparetor = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch1,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenInchAndInch_WhenSameValue_ThenTrue() throws QuantityMeasurementException {
        double inch1 = 60.0,inch2 = 60.0;
        UnitComparetor unitComparetor = new UnitComparetor(inch1,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch2,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFeetAndInch_WhenZero_ThenTrue() throws QuantityMeasurementException {
        double feet1 = 0.0,inch = 0.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch,Length.INCH);
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
    public void givenFeetAndInch_When12InchEqulsTo1Feet_ThenTrue() throws QuantityMeasurementException {
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
    public void givenInchAndCentimeter_When2InchTo5Centimeter_ThenTrue() throws QuantityMeasurementException {
        double inch = 2,centimeter = 5;
        UnitComparetor unitComparetor = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(centimeter,Length.CENTIMETER);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenTwoLength_WhenAddition_ThenTrue() {
        double inch1 = 2,inch2 =2;
        UnitComparetor unitComparetor = new UnitComparetor(inch1,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch2,Length.INCH);
        double result = quantityMeasurement.addition(unitComparetor,unitComparetor2);
        Assert.assertEquals(4,result,0);
    }
    @Test
    public void givenFeetAndInch_WhenAddition_ThenTrue() throws QuantityMeasurementException {
        double feet = 1,inch =2;
        UnitComparetor unitComparetor = new UnitComparetor(feet,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch,Length.INCH);
        double result = quantityMeasurement.addition(unitComparetor,unitComparetor2);
        Assert.assertEquals(14,result,0);
    }
    @Test
    public void givenFeetAndFeet_WhenAddition_ThenTrue() throws QuantityMeasurementException {
        double feet = 1,feet2 = 1;
        UnitComparetor unitComparetor = new UnitComparetor(feet,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2,Length.FEET);
        double result = quantityMeasurement.addition(unitComparetor,unitComparetor2);
        Assert.assertEquals(24,result,0);
    }
    @Test
    public void givenInchAndCentimeter_WhenAddition_ThenTrue() throws QuantityMeasurementException {
        double inch = 2,cm = 2.5;
        UnitComparetor unitComparetor = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(cm,Length.CENTIMETER);
        double result = quantityMeasurement.addition(unitComparetor,unitComparetor2);
        Assert.assertEquals(3,result,0);
    }
    @Test
    public void givenGallonAndLitres_WhenCompair_ThenTrue() throws QuantityMeasurementException {
        double gallon = 1,litre = 3.78;
        UnitComparetor unitComparetor = new UnitComparetor(gallon,Length.GALLON);
        UnitComparetor unitComparetor2 = new UnitComparetor(litre,Length.LITRE);
        Boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLitrAndMl_WhenCompair_ThenTrue() throws QuantityMeasurementException {
        double litre = 1,ml = 1000;
        UnitComparetor unitComparetor = new UnitComparetor(litre,Length.LITRE);
        UnitComparetor unitComparetor2 = new UnitComparetor(ml,Length.ML);
        Boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenValuemInLiter_WhenAdditio_ThenReturResult() throws QuantityMeasurementException {
        double gallon = 1,litre = 3.78;
        UnitComparetor unitComparetor = new UnitComparetor(litre,Length.LITRE);
        UnitComparetor unitComparetor2 = new UnitComparetor(gallon,Length.GALLON);
        double result = quantityMeasurement.addition(unitComparetor,unitComparetor2);
        Assert.assertEquals(7.56,result,0);
    }
    @Test
    public void givenLitresAndMl_WhenAdditio_ThenReturResult() throws QuantityMeasurementException {
        double ml = 1000,litre = 1;
        UnitComparetor unitComparetor = new UnitComparetor(litre,Length.LITRE);
        UnitComparetor unitComparetor2 = new UnitComparetor(ml,Length.ML);
        double result = quantityMeasurement.addition(unitComparetor,unitComparetor2);
        Assert.assertEquals(2,result,0);
    }
    @Test
    public void givenKgAndGrams_WhenCompare_ThenTrue() throws QuantityMeasurementException {
        double kg = 1,grams = 1000;
        UnitComparetor unitComparetor = new UnitComparetor(kg,Length.KILOGRAMS);
        UnitComparetor unitComparetor2 = new UnitComparetor(grams,Length.GRAM);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenTonneAndkgs_WhenCompare_ThenTrue() throws QuantityMeasurementException {
        double kgs = 1000,tonne = 1;
        UnitComparetor unitComparetor = new UnitComparetor(kgs,Length.KILOGRAMS);
        UnitComparetor unitComparetor2 = new UnitComparetor(tonne,Length.TONNE);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenTonneAndgs_WhenAddition_ThenTrue() throws QuantityMeasurementException {
        double gm = 1000,tonne = 1;
        UnitComparetor unitComparetor = new UnitComparetor(gm,Length.GRAM);
        UnitComparetor unitComparetor2 = new UnitComparetor(tonne,Length.TONNE);
        double result = quantityMeasurement.addition(unitComparetor,unitComparetor2);
        Assert.assertEquals(1001,result,0);
    }
    @Test
    public void givenFahrenheitAndCelsius_WhenCompare_ThenTrue() throws QuantityMeasurementException {
        double fahrenheit = 212,celsius = 100;
        UnitComparetor unitComparetor = new UnitComparetor(fahrenheit,Length.FAHRENHEIT);
        UnitComparetor unitComparetor2 = new UnitComparetor(celsius,Length.CELSIUS);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
}
