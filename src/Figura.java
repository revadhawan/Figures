public class Figura {

    double Area=0;
    Rectangle rectangle = new Rectangle();
    Quadrat quadrat = new Quadrat();
    Cercle cercle = new Cercle();
    Triangle triangle = new Triangle();

    public double CalculArea (String figura, double base, double altura, double radi) {

        if (figura == "Rectangle") {
            Area = rectangle.Area(base,altura);
        }
        else if(figura == "Quadrat"){
            Area = quadrat.Area(base);

        }
        else if(figura == "Triangle"){
            Area = triangle.Area(base, altura);

        }
        else if(figura == "Cercle"){
            Area = cercle.Area(radi);

        }

        return Area;
    }



}

