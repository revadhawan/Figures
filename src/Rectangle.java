public class Rectangle extends Figura{

    double base;
    double altura;

    public Rectangle (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double area(){
        return base*altura;
    }
}

