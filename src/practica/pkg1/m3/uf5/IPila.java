package practica.pkg1.m3.uf5;

import java.util.ArrayList;

public interface IPila<T> {

    public void afegir(T t);
    
    public T treure();
    
    public void buidar();
    
    public int mida();
    
    public void toArray();
    
    /**
     * private ArrayList <T> llista;

    public Pila() {
        llista = new ArrayList<>();
    }

    public void afegir(T t) {
        llista.add(t);
    }

    public T treure() {
        T t = null;
        if (!llista.isEmpty()) {
            t = llista.remove(llista.size() - 1);
        }
        return t;
    }

    public T[] arrayPila() {
        return isEmpty()?null:(T[]) llista.toArray();
    }
    
    public boolean isEmpty(){
        return llista.isEmpty();
    }
     */
}
