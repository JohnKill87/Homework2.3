package pro.sky.lightcalculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String calculator() {
        return "Добро пожаловать";
    }

    public String answerCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    public String Addition(int userNumber1, int userNumber2) {
        int userNumber3 = userNumber1 + userNumber2;
        return userNumber1 + " + " + userNumber2 + " = " + userNumber3;
    }

    public String subtraction(int userNumber1, int userNumber2) {
        int userNumber3 = userNumber1 - userNumber2;
        return userNumber1 + " + " + userNumber2 + " = " + userNumber3;
    }

    public String multiplication(int userNumber1, int userNumber2) {
        int userNumber3 = userNumber1 * userNumber2;
        return userNumber1 + " + " + userNumber2 + " = " + userNumber3;
    }

    public String division(int userNumber1, int userNumber2) {
        int userNumber3 = userNumber1 / userNumber2;
        return userNumber1 + " + " + userNumber2 + " = " + userNumber3;
    }
}
