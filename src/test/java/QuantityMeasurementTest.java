import com.brijlab.services.Length;
import com.brijlab.services.QuantityMeasurementMain;
import com.brijlab.services.UnitComparetor;
import org.junit.Assert;
import org.junit.Test;
public class QuantityMeasurementTest {

       QuantityMeasurementMain quantityMeasurement = new QuantityMeasurementMain();
       @Test
       public void givenFitAndLengthIsZero_WhenCompair_ThenTrue() {
           UnitComparetor unitComparetor = new UnitComparetor(0,Length.FEET);
           UnitComparetor unitComparetor2 = new UnitComparetor(0,Length.FEET);
           boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
           Assert.assertEquals(true,result);
       }
}
