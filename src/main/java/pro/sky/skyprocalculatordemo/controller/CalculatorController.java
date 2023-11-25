package pro.sky.skyprocalculatordemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprocalculatordemo.service.CalculatorServiceImpl;

@RestController
@RequestMapping(path = "/calculator")

public class CalculatorController {
    private final CalculatorServiceImpl calculatorServiceImpl;

    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping
    public String answerWelcome() {
        return calculatorServiceImpl.answerWelcome();
    }

    @GetMapping(path = "/plus")
    public String calculateSummation(@RequestParam("num1") Integer num1,
                                     @RequestParam("num2") Integer num2) {
        return num1 + " + " + num2 + " = " + calculatorServiceImpl.calculateSummation(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String calculateSubtraction(@RequestParam("num1") Integer num1,
                                       @RequestParam("num2") Integer num2) {
        return num1 + " - " + num2 + " = " + calculatorServiceImpl.calculateSubtraction(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String calculateMultiplication(@RequestParam("num1") Integer num1,
                                          @RequestParam("num2") Integer num2) {
        return num1 + " * " + num2 + " = " + calculatorServiceImpl.calculateMultiplication(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculateDivision(@RequestParam("num1") Integer num1,
                                    @RequestParam("num2") Integer num2) {
        return num1 + " : " + num2 + " = " + calculatorServiceImpl.calculateDivision(num1, num2);
    }
}
