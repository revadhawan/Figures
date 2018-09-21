public class Main {
    public static void main(String[] args) {
        double areatotal=0;
        Figura figura = new Figura();
        double Area = figura.CalculArea("Rectangle", 4,5,0 );

        System.out.println("Area de la figura:");
        System.out.println (Area);
        areatotal=areatotal+Area;
        Area = figura.CalculArea("Rectangle", 4,5,0 );
        System.out.println("Area de la figura:");
        System.out.println (Area);
        areatotal=areatotal+Area;
        Area = figura.CalculArea("Rectangle", 4,5,0 );
        System.out.println("Area de la figura:");
        System.out.println (Area);
        areatotal=areatotal+Area;
        System.out.println("Area total: "+areatotal);

    }

}
