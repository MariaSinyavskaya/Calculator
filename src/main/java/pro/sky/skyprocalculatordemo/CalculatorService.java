package pro.sky.skyprocalculatordemo;

public interface CalculatorService {
    String printWelcome();
    String answerWelcome();
    String calculateSummation(int num1, int num2);
    String calculateSubtraction(int num1, int num2);
    String calculateMultiplication(int num1, int num2);
    String calculateDivision(int num1, int num2);
}
