package pro.sky.skyprocalculatordemo.service;

import org.junit.jupiter.api.Test;
import pro.sky.skyprocalculatordemo.exception.NoParamsException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.skyprocalculatordemo.constants.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnResultIs53ForCalculateSummationMethod() {
        Integer result = out.calculateSummation(NUMBER_IS_20, NUMBER_IS_33);
        assertEquals(EXPECTED_RESULT_IS_53, result);
    }

    @Test
    public void shouldThrowNoParamsExceptionWhenParamIsNullForCalculateSummationMethod() {
        assertThrows(NoParamsException.class,
                () -> out.calculateSummation(NUMBER_IS_20, NUMBER_IS_NULL));
    }

    @Test
    public void shouldReturnResultIs13ForCalculateSubtractionMethod() {
        Integer result = out.calculateSubtraction(NUMBER_IS_33, NUMBER_IS_20);
        assertEquals(EXPECTED_RESULT_IS_13, result);
    }

    @Test
    public void shouldThrowNoParamsExceptionWhenParamIsNullForCalculateSubtractionMethod() {
        assertThrows(NoParamsException.class,
                () -> out.calculateSubtraction(NUMBER_IS_NULL, NUMBER_IS_NULL));
    }

    @Test
    public void shouldReturnResultIs660ForCalculateMultiplicationMethod() {
        Integer result = out.calculateMultiplication(NUMBER_IS_33, NUMBER_IS_20);
        assertEquals(EXPECTED_RESULT_IS_660, result);
    }

    @Test
    public void shouldThrowNoParamsExceptionWhenParamIsNullForCalculateMultiplicationMethod() {
        assertThrows(NoParamsException.class,
                () -> out.calculateMultiplication(NUMBER_IS_NULL, NUMBER_IS_20));
    }

    @Test
    public void shouldReturnResultIs1Point65ForCalculateDivisionMethod() {
        Float result = out.calculateDivision(NUMBER_IS_33, NUMBER_IS_20);
        assertEquals(EXPECTED_RESULT_IS_1_POINT_65, result);
    }

    @Test
    public void shouldThrowNoParamsExceptionWhenParamIsNullForCalculateDivisionMethod() {
        assertThrows(NoParamsException.class,
                () -> out.calculateDivision(NUMBER_IS_NULL, NUMBER_IS_20));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenSecondParamIs0ForCalculateDivisionMethod() {
        assertThrows(IllegalArgumentException.class,
                () -> out.calculateDivision(NUMBER_IS_33, NUMBER_IS_0));
    }

    @Test
    public void shouldReturnAnswerWelcomeMessage() {
        String result = out.answerWelcome();
        assertEquals(ANSWER_WELCOME_MESSAGE, result);
    }
}
