public class Cercle extends Figura{
    double radi;

    public Cercle (double radi){
        this.radi = radi;
    }

    public double area(){
        return radi*radi*Math.PI;
    }

}
