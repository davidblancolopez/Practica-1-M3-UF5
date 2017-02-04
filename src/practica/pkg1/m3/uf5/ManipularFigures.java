package practica.pkg1.m3.uf5;

import java.util.Arrays;

public class ManipularFigures {

    /**
     * Metode rep una pila de figures.
     * Retorna la mitjana de la pila.
     * @param figura
     * @return 
     */
    public double mitjanaPerimetres(PilaGenerica<Figura> figura) {
        double mitjana = 0;
        for (Figura i : figura.toArray(Figura.class)) {
            mitjana += i.perimetre();
        }
        return mitjana / figura.mida();
    }

    /**
     * Metode que rep un array de tipus generic.
     * Retorna l'array ordenat.
     * @param <T>
     * @param t
     * @return 
     */
    public <T> T[] arrayOrdenat(T[] t) {
        Arrays.sort(t);
        return t;
    }
}
