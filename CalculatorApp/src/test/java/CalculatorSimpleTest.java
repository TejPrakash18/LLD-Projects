import org.example.CalculatorSimple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSimpleTest {

    public CalculatorSimple calculatorSimple = new CalculatorSimple();
    @Test
    public void testAddition(){
        assertEquals(10, calculatorSimple.add(3,7));
    }

}
