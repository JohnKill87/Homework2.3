package pro.sky.lightcalculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String answerCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    public String Addition(Integer userNumber1, Integer userNumber2) {
        if (userNumber1 != null || userNumber2 != null) {
            int userNumber3 = userNumber1 + userNumber2;
            return userNumber1 + " + " + userNumber2 + " = " + userNumber3;
        } else {
            return "Ошибка";
        }
    }

    public String subtraction(Integer userNumber1, Integer userNumber2) {
        if (userNumber1 != null || userNumber2 != null) {
            int userNumber3 = userNumber1 - userNumber2;
            return userNumber1 + " - " + userNumber2 + " = " + userNumber3;
        } else {
            return "Ошибка";
        }
    }

    public String multiplication(Integer userNumber1, Integer userNumber2) {
        if (userNumber1 != null || userNumber2 != null) {
            int userNumber3 = userNumber1 * userNumber2;
            return userNumber1 + " * " + userNumber2 + " = " + userNumber3;
        } else {
            return "Ошибка";
        }
    }

    public String division(Integer userNumber1, Integer userNumber2) {
        if (userNumber2 == 0 || userNumber1 == 0) {
            return "Ошибка: нельзя делить на 0";
        }  if (userNumber1 != null || userNumber2 != null) {
            int userNumber3 = userNumber1 / userNumber2;
            return userNumber1 + " / " + userNumber2 + " = " + userNumber3;
    } else {
        return "Ошибка";
        }
    }
}
