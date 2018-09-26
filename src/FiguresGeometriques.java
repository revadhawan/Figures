import java.util.Arrays;

public class FiguresGeometriques {

public double suma(Figura [] v) {
    double suma = 0;

    for (Figura f : v) {
        suma = suma + f.area();
    }

    return suma;
}

    public void sort(Figura[] v) {
        Arrays.sort(v);
    }

}





