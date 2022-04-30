import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Task1Test {
    @ParameterizedTest
    @MethodSource("source")
    public void test_fourLetters_equals(String input, Integer expected){
        Assertions.assertEquals(expected, Task1.fourLetters(input));
    }

    private static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("Inili Dori Maordris", 1),
                Arguments.of("Trori Dori Lori", 2),
                Arguments.of("Inikali Dori Maordris Tobi Bo", 2),
                Arguments.of("Ai Bo", 0),
                Arguments.of("Aliki Bonini", 0)
        );
    }
}
