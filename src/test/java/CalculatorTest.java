import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CalculatorTest {

    @Test
    void addTest(){
        int num1 = 5;
        int num2 = 6;

        assertEquals(11, Calculator.calculate(num1,num2));
    }


    @Test
    void failTest(){
        int num1 = 5;
        int num2 = 8;

        assertFalse(11 == Calculator.calculate(num1,num2));
    }

}
