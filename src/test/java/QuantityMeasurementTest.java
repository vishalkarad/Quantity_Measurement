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
}
