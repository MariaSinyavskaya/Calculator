package pro.sky.skyprocalculatordemo.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.skyprocalculatordemo.constants.CalculatorServiceImplTestConstants.*;
public class CalculatorServiceImplParameterizedTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForCalculateSummationTests() {
        return Stream.of(
                Arguments.of(NUMBER_IS_20,NUMBER_IS_33, EXPECTED_RESULT_IS_53),
                Arguments.of(10, 20, 30)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCalculateSummationTests")
    public void calculateSummationParameterizeTest(int num1, int num2, int expectedResult) {
        Integer result = out.calculateSummation(num1, num2);
        assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> provideParamsForCalculateSubtractionTests() {
        return Stream.of(
                Arguments.of(NUMBER_IS_33,NUMBER_IS_20, EXPECTED_RESULT_IS_13),
                Arguments.of(30, 20, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCalculateSubtractionTests")
    public void calculateSubtractionParameterizeTest(int num1, int num2, int expectedResult) {
        Integer result = out.calculateSubtraction(num1, num2);
        assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> provideParamsForCalculateMultiplicationTests() {
        return Stream.of(
                Arguments.of(NUMBER_IS_33,NUMBER_IS_20, EXPECTED_RESULT_IS_660),
                Arguments.of(2, 4, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCalculateMultiplicationTests")
    public void calculateMultiplicationParameterizeTest(int num1, int num2, int expectedResult) {
        Integer result = out.calculateMultiplication(num1, num2);
        assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> provideParamsForCalculateDivisionTests() {
        return Stream.of(
                Arguments.of(NUMBER_IS_33,NUMBER_IS_20, EXPECTED_RESULT_IS_1_POINT_65),
                Arguments.of(25, 4, 6.25F)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCalculateDivisionTests")
    public void calculateDivisionParameterizeTest(int num1, int num2, float expectedResult) {
        Float result = out.calculateDivision(num1, num2);
        assertEquals(expectedResult, result);
    }
}
