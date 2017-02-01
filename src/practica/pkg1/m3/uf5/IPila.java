package practica.pkg1.m3.uf5;

import java.util.ArrayList;

public interface IPila<T> {

    private ArrayList<T> llista;

    public IPila() {
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
    
    public T buidar(){
        
    }
}
