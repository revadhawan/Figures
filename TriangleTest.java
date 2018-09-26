import static org.junit.Assert.*;
import org.junit.*;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void SetUp() {
        triangle = new Triangle(3,4);
    }

    @After
    public void TearDown() {
        triangle = null;
    }

    @Test
    public void ActualTest() {
        assertEquals(6, triangle.area());
    }

}
