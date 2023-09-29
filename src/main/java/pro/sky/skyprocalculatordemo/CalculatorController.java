package pro.sky.skyprocalculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public String calculateSummation(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
            return calculatorServiceImpl.calculateSummation(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String calculateSubtraction(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return calculatorServiceImpl.calculateSubtraction(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String calculateMultiplication(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return calculatorServiceImpl.calculateMultiplication(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculateDivision(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return calculatorServiceImpl.calculateDivision(num1, num2);
    }
}
