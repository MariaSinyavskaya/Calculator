package pro.sky.skyprocalculatordemo;

public interface CalculatorService {
    String answerWelcome();
    int calculateSummation(int num1, int num2);
    int calculateSubtraction(int num1, int num2);
    int calculateMultiplication(int num1, int num2);
    float calculateDivision(int num1, int num2);
}
