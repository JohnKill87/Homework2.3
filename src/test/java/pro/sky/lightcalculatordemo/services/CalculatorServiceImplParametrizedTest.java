package pro.sky.lightcalculatordemo.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParametrizedTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> additionParams() {
        return Stream.of(
                Arguments.of(5, 5, "5 + 5 = 10","+"),
                Arguments.of(0, 5, "0 + 5 = 5", "+"),
                Arguments.of(2, 2, "2 + 2 = 4","+")
        );
    }

    @ParameterizedTest
    @MethodSource("additionParams")
    void plus(int userNumber1, int userNumber2, String expectedResult) {
        String actualResult = calculatorService.addition(userNumber1, userNumber2);
        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> subtractionParams() {
        return Stream.of(
                Arguments.of(5, 5, "5 - 5 = 0","-"),
                Arguments.of(0, 5, "0 - 5 = -5", "-"),
                Arguments.of(2, 2, "2 - 2 = 0","-")
        );
    }

    @ParameterizedTest
    @MethodSource("subtractionParams")
    void subtraction(int userNumber1, int userNumber2, String expectedResult) {
        String actualResult = calculatorService.subtraction(userNumber1, userNumber2);
        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> multiplicationParams() {
        return Stream.of(
                Arguments.of(5, 5, "5 * 5 = 25","*"),
                Arguments.of(0, 5, "0 * 5 = 0", "*"),
                Arguments.of(2, 2, "2 * 2 = 4","*")
        );
    }

    @ParameterizedTest
    @MethodSource("multiplicationParams")
    void multiplication(int userNumber1, int userNumber2, String expectedResult) {
        String actualResult = calculatorService.multiplication(userNumber1, userNumber2);
        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> divisionParams() {
        return Stream.of(
                Arguments.of(25, 5, "25 : 5 = 5.0",":"),
                Arguments.of(10, 5, "10 : 5 = 2.0", ":"),
                Arguments.of(8, 2, "8 : 2 = 4.0",":")
        );
    }

    @ParameterizedTest
    @MethodSource("divisionParams")
    void division(int userNumber1, int userNumber2, String expectedResult) {
        String actualResult = calculatorService.division(userNumber1, userNumber2);
        assertEquals(expectedResult, actualResult);
    }
}
