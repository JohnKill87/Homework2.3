package pro.sky.lightcalculatordemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.lightcalculatordemo.services.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String answerCalculator() {
        return calculatorService.answerCalculator();
    }

    @GetMapping(path = "/plus")
    public String Addition(@RequestParam("num1")  Integer userNumber1, @RequestParam("num2") Integer userNumber2) {
        return calculatorService.addition(userNumber1, userNumber2);
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam("num1") Integer userNumber1, @RequestParam("num2") Integer userNumber2) {
        return calculatorService.subtraction(userNumber1, userNumber2);
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam("num1") Integer userNumber1, @RequestParam("num2" ) Integer userNumber2) {
        return calculatorService.multiplication(userNumber1, userNumber2);
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam("num1") Integer userNumber1, @RequestParam("num2") Integer userNumber2) {
        return calculatorService.division(userNumber1, userNumber2);
    }

}
