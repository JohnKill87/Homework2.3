package pro.sky.lightcalculatordemo.services;

public interface CalculatorService {

    String answerCalculator();

    String addition(Integer userNumber1, Integer userNumber2);

    String subtraction(Integer userNumber1, Integer userNumber2);

    String multiplication(Integer userNumber1, Integer userNumber2);

    String division(Integer userNumber1, Integer userNumber2);
}
