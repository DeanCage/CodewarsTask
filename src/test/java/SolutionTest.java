import org.example.Sequence;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;


public class SolutionTest {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1}, Sequence.reverse(5));
    }
}