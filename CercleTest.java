import static org.junit.Assert.*;
import org.junit.*;

public class CercleTest {

    Cercle cercle;

    @Before
    public void SetUp() {
        cercle = new Cercle(2);
    }

    @After
    public void TearDown(){
        cercle = null;
    }

    @Test
    public void ActualTest() {
        assertEquals(4*Math.PI, cercle.area());
    }
}
