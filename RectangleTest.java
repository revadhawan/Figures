import static org.junit.Assert.*;
import org.junit.*;

public class RectangleTest {

    Rectangle rectangle;

    @Before
    public void SetUp() {
       rectangle = new Rectangle(3,4);
    }

    @After
    public void TearDown() {
        rectangle = null;
    }

    @Test
    public void RectangleTest() {
        assertEquals(32, rectangle.area());
    }


}
