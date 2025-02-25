import org.example.CalculatorSimple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSimpleTest {


    public CalculatorSimple calculatorSimple = new CalculatorSimple();

    @Test
    public void testAddition(){
        assertEquals(10, calculatorSimple.add(3,7));
    }

    @Test
    public void testSubtraction(){
        assertEquals(12, calculatorSimple.sub(18,6));
    }
    @Test
    public void testMultiply(){
        assertEquals(15, calculatorSimple.mul(5,3));
    }
    @Test
    public void testDivide(){
        assertEquals(4, calculatorSimple.div(12,3));
    }

    @Test
    public void testModule(){
        assertEquals(1,  calculatorSimple.mod(13,2));
    }
}
