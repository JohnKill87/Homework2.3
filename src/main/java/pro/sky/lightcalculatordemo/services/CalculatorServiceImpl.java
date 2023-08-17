package pro.sky.lightcalculatordemo.services;

import org.springframework.stereotype.Service;
import pro.sky.lightcalculatordemo.exceptions.CantDivideByZeroException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String answerCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    public String addition(Integer userNumber1, Integer userNumber2) {
        return getResult(userNumber1, userNumber2, "+", String.valueOf(userNumber1 + userNumber2));
    }

    public String subtraction(Integer userNumber1, Integer userNumber2) {
        return getResult(userNumber1, userNumber2, "-", String.valueOf(userNumber1 - userNumber2));
    }

    public String multiplication(Integer userNumber1, Integer userNumber2) {
        return getResult(userNumber1, userNumber2, "*", String.valueOf(userNumber1 * userNumber2));
    }

    public String division(Integer userNumber1, Integer userNumber2) {
        if (userNumber2 == 0) {
            throw new CantDivideByZeroException("Ошибка: нельзя делить на 0");
        } else {
            double result = (double) userNumber1 / userNumber2;
            return getResult(userNumber1, userNumber2, ":", String.valueOf(result));
        }
    }

    private String getResult(Integer userNumber1, Integer userNumber2, String operation, String result) {
        return String.format("%s %s %s = %s", userNumber1, operation, userNumber2, result);
    }
}
