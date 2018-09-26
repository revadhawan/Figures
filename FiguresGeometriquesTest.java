import static org.junit.Assert.*;
import org.junit.Test;


public class FiguresGeometriquesTest {

    @Test
    public void TriangleTest () {
        Triangle triangle = new Triangle(3,4);

        double expArea = 6;
        double resArea = triangle.area();

        assertEquals(expArea, resArea);
    }


    @Test
    public void RectangleTest () {
        Rectangle rectangle = new Rectangle(3,4);

        double expArea = 12;
        double resArea = rectangle.area();

        assertEquals(expArea, resArea);
    }


    @Test
    public void CercleTest () {
        Cercle cercle = new Cercle(3);

        double expArea = 9*Math.PI;
        double resArea = cercle.area();

        assertEquals(expArea, resArea);
    }

    @Test
    public void QuadratTest () {
        Quadrat quadrat = new Quadrat(4);

        double expArea = 16;
        double resArea = quadrat.area();

        assertEquals(expArea, resArea);
    }




}