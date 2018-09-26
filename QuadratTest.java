import static org.junit.Assert.*;
import org.junit.*;

public class QuadratTest {

    Quadrat quadrat;

    @Before
    public void SetUp() {
        quadrat = new Quadrat(3);
    }

    @After
    public void TearDown() {
        quadrat = null;
    }

    @Test
    public void ActualTest() {
        assertEquals(9, quadrat.area());
    }
}
