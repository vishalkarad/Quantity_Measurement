import com.brijlab.services.QuantityMeasurementMain;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    QuantityMeasurementMain quantityMeasurement = new QuantityMeasurementMain();
    @Test
    public void givenFitAndLength_WhenCompair_ThenTrue() {
        int fit = 2;
        int inch = 24;
        boolean result = quantityMeasurement.checkQuantity(fit,inch);
        Assert.assertEquals(true,result);
    }
}
