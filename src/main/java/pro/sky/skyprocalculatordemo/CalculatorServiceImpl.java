package pro.sky.skyprocalculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    public String answerWelcome() {
        return "<center> <h1>Добро пожаловать в калькулятор</h1> </center>";
    }

    public int calculateSummation(int num1, int num2) {
        return num1 + num2;
    }

    public int calculateSubtraction(int num1, int num2) {
        return num1-num2;
    }

    public int calculateMultiplication(int num1, int num2) {
        return num1*num2;
    }

    public float calculateDivision(int num1, int num2) {
        return  (float) num1 / (float) num2;
    }
}
