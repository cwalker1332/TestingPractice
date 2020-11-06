import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdderTest {
    @Test
    public void add_whenOneInputIsZero_shouldReturnOtherNumber () {
        // Given: some object
        Adder adder = new Adder();

        // When: do something
        int result = adder.add(0, 5);

        // Then: assert what should happen/is expected
        // expected = first value in parentheses, actual result = second value
        Assertions.assertEquals(5, result);
    }
}