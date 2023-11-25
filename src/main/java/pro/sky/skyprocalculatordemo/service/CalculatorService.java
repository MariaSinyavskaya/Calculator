package pro.sky.skyprocalculatordemo.service;

import pro.sky.skyprocalculatordemo.exception.NoParamsException;

public interface CalculatorService {
    String answerWelcome();
    Integer calculateSummation(Integer num1, Integer num2) throws NoParamsException;
    Integer calculateSubtraction(Integer num1, Integer num2) throws NoParamsException;
    Integer calculateMultiplication(Integer num1, Integer num2) throws NoParamsException;
    Float calculateDivision(Integer num1, Integer num2) throws IllegalArgumentException, NoParamsException;}
