public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4,5);
        Quadrat quadrat = new Quadrat(4);
        Triangle triangle = new Triangle(3, 6);
        Cercle cercle = new Cercle(2);

        Figura [] v = new Figura[4];
        v[0] = rectangle;
        v[1] = quadrat;
        v[2] = triangle;
        v[3] = cercle;

        FiguresGeometriques geometriques = new FiguresGeometriques();
        double area = geometriques.suma(v);
        System.out.println("Area:" +area);
        geometriques.sort(v);
        for (Figura f:v) {
            System.out.println(f.area());
        }

    }
}
