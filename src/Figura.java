public class Figura {

    double Area, base, altura, radi, costat;
    String figura;

    Rectangle rectangle = new Rectangle();
    Quadrat quadrat = new Quadrat();
    Cercle cercle = new Cercle();
    Triangle triangle = new Triangle();

    public double CalculArea (String figura, double base, double altura) {

        if (figura == "Rectangle") {
            Area = rectangle.Area(base,altura);
        }
        else if(figura == "Quadrat"){

        }
        return Area;
    }



}
