import com.brijlab.services.QuantityMeasurementMain;
import org.junit.Assert;
import org.junit.Test;
public class QuantityMeasurementTest {

    QuantityMeasurementMain quantityMeasurement = new QuantityMeasurementMain();

    @Test
    public void givenFitAndLengthIsZero_WhenCompair_ThenTrue() {
        int feet1 = 0;
        int feet2 = 0;
        boolean result = quantityMeasurement.checkFeetQuantity(feet1,feet2);
        Assert.assertEquals(true,result);
    }
}
