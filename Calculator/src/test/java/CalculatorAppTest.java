import org.example.CalculatorApp;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAppTest {
    public CalculatorApp obj = new CalculatorApp();


    @Test
    public void TestAddition(){
        assertEquals(10, obj.add(5,6));

    }

}
