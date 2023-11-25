package pro.sky.skyprocalculatordemo.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprocalculatordemo.exception.NoParamsException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String answerWelcome() {
        return "<center> <h1>Добро пожаловать в калькулятор!</h1> </center>";
    }

    public Integer calculateSummation(Integer num1, Integer num2) throws NoParamsException {
        if ((num1 == null) || (num2 == null)) {
            throw new NoParamsException("Некорректный ввод параметров");
        }
        return num1 + num2;
    }

    public Integer calculateSubtraction(Integer num1, Integer num2) throws NoParamsException {
        if ((num1 == null) || (num2 == null)) {
            throw new NoParamsException("Некорректный ввод параметров");
        }
        return num1 - num2;
    }

    public Integer calculateMultiplication(Integer num1, Integer num2) throws NoParamsException{
        if ((num1 == null) || (num2 == null)) {
            throw new NoParamsException("Некорректный ввод параметров");
        }
        return num1 * num2;
    }

    public Float calculateDivision(Integer num1, Integer num2)
            throws IllegalArgumentException, NoParamsException{
        if ((num1 == null) || (num2 == null)) {
            throw new NoParamsException("Некорректный ввод параметров");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Делить на 0 нельзя!");
        }
        return (float) num1 / (float) num2;
    }
}
