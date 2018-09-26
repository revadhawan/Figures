public class Triangle extends Figura{
    double base;
    double altura;

    public Triangle (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area(){

        return (base*altura)/2;
    }
}
