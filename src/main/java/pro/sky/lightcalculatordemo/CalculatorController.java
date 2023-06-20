package pro.sky.lightcalculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/calculator")
    public String answerCalculator() {
        return calculatorService.answerCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String Addition(@RequestParam("num1") int userNumber1, @RequestParam("num2") int userNumber2) {
        return calculatorService.Addition(userNumber1, userNumber2);
    }

    @GetMapping(path = "/calculator/minus")
    public String subtraction(@RequestParam("num1") int userNumber1, @RequestParam("num2") int userNumber2) {
        return calculatorService.subtraction(userNumber1, userNumber2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplication(@RequestParam("num1") int userNumber1, @RequestParam("num2") int userNumber2) {
        return calculatorService.multiplication(userNumber1, userNumber2);
    }

    @GetMapping(path = "/calculator/divide")
    public String division(@RequestParam("num1") int userNumber1, @RequestParam("num2") int userNumber2) {
        return calculatorService.division(userNumber1, userNumber2);
    }
}
