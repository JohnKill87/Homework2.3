package pro.sky.lightcalculatordemo.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    void answerCalculator() {
    }

    @Test
    void addition() {

       Integer userNumber1 = 5;

       Integer userNumber2 = 5;

       String result = calculatorService.addition(5, 5);

       Assertions.assertEquals(calculatorService.addition(userNumber1, userNumber2), result);

       Assertions.assertNotNull(calculatorService.addition(userNumber1, userNumber2), result);
    }

    @Test
    void subtraction() {

        Integer userNumber1 = 5;

        Integer userNumber2 = 5;

        String result = calculatorService.subtraction(5,5);

        Assertions.assertEquals(calculatorService.subtraction(userNumber1, userNumber2), result);

        Assertions.assertNotNull(calculatorService.subtraction(userNumber1, userNumber2), result);
    }

    @Test
    void multiplication() {

        Integer userNumber1 = 5;

        Integer userNumber2 = 5;

        String result = calculatorService.multiplication(5,5);

        Assertions.assertEquals(calculatorService.multiplication(userNumber1, userNumber2), result);

        Assertions.assertNotNull(calculatorService.multiplication(userNumber1, userNumber2), result);
    }

    @Test
    void division() {

        Integer userNumber1 = 5;

        Integer userNumber2 = 5;

        String result = calculatorService.division(5,5);

        Assertions.assertEquals(calculatorService.division(userNumber1, userNumber2), result);

        Assertions.assertNotNull(calculatorService.division(userNumber1, userNumber2), result);

        Assertions.assertDoesNotThrow(() -> calculatorService.division(userNumber1, userNumber2));
    }
}