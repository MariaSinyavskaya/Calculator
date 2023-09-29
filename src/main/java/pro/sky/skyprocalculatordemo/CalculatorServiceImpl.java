package pro.sky.skyprocalculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String printWelcome() {
        return "<center><h1>Добро пожаловать в калькулятор</h1></center>";
    }

    public String answerWelcome() {
        return "<center> <h1>Добро пожаловать в калькулятор</h1> </center>";
    }

    public String calculateSummation(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String calculateSubtraction(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1-num2);
    }

    public String calculateMultiplication(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1*num2);
    }

    public String calculateDivision(int num1, int num2) {
        if (num2 != 0) {
            return num1 + " : " + num2 + " = " + ((float) num1 / (float) num2);
        } else {
            return "num2 не может равняться нулю!";
        }
    }
}
