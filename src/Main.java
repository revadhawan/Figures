public class Main {
    public static void main(String[] args) {
        double areatotal=0;
        Figura figura [] = new Figura[10];
        double[] Area = new double[10];
        for (int i=0; i<10; i++)
        {
            Area[0] = figura[i].CalculArea("Rectangle", 4,5,0 );
            System.out.println("Area de la figura:");
            System.out.println (Area[i]);
        }
        for (int i=0; i<10; i++)
        {
            areatotal=areatotal + Area[i] +1;
        }

        System.out.println("Area de la figura:");
        System.out.println (areatotal);


    }

}
