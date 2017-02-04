package practica.pkg1.m3.uf5;

import java.util.Arrays;

public class ManipularFigures {

    public double mitjanaPerimetres(PilaGenerica<Figura> figura) {
        double mitjana = 0;
        for (Figura i : figura.toArray(Figura.class)) {
            mitjana += i.perimetre();
        }
        return mitjana / figura.mida();
    }

    
    public <T> T[] arrayOrdenat(T[] t) {
        Arrays.sort(t);
        return t;
    }
}
