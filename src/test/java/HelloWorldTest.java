
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    void testAddition() {
        assertEquals(5, HelloWorld.add(2, 3));
    }
}
