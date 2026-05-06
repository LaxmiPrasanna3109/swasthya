import static org.junit.Assert.*;
import org.junit.Test;

public class CalculationTest {

    @Test
    public void testSum() {
        Calculation c = new Calculation();
        int result = c.sum(10, 5);
        assertEquals(15, result);
    }
}
