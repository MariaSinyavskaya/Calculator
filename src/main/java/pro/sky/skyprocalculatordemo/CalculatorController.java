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
    public String calculateSummation(@RequestParam(value = "num1", required = false) Integer num1,@RequestParam(value = "num2", required = false) Integer num2) {
        if (num1  == null || num2 == null) {
            return "Некорректный запрос";
        }else {
            return num1 + " + " + num2 + " = " + calculatorServiceImpl.calculateSummation(num1, num2);
        }
    }

    @GetMapping(path = "/minus")
    public String calculateSubtraction(@RequestParam(value = "num1", required = false) Integer num1,@RequestParam(value = "num2", required = false) Integer num2) {
        if (num1  == null || num2 == null) {
            return "Некорректный запрос";
        }else {
            return num1 + " - " + num2 + " = " + calculatorServiceImpl.calculateSubtraction(num1, num2);
        }
    }

    @GetMapping(path = "/multiply")
    public String calculateMultiplication(@RequestParam(value = "num1", required = false) Integer num1,@RequestParam(value = "num2", required = false) Integer num2) {
        if (num1  == null || num2 == null) {
            return "Некорректный запрос";
        }else {
            return num1 + " * " + num2 + " = " + calculatorServiceImpl.calculateMultiplication(num1, num2);
        }
    }

    @GetMapping(path = "/divide")
    public String calculateDivision(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1  == null || num2 == null) {
            return "Некорректный запрос";
        }else {
            if (num2 != 0) {
                return num1 + " : " + num2 + " = " + calculatorServiceImpl.calculateDivision(num1, num2);
            } else {
                return "num2 не может равняться нулю!";
            }
        }
    }
}
