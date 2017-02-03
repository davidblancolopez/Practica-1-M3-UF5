
package practica.pkg1.m3.uf5;

import java.util.ArrayList;


public class PilaGenerica implements IPila{

    private ArrayList <T> llista;
    @Override
    public void afegir(Object t) {
        llista.add(t);
    }

    @Override
    public Object treure() {
        T t = null;
        if (!llista.isEmpty()) {
            t = llista.remove(llista.size() - 1);
        }
        return t;
    }

    @Override
    public void buidar() {
        
    }

    @Override
    public int mida() {
        
    }

    @Override
    public Object[] toArray(Class t) {
        
    }
    
     /**
     * 

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
    
    private class Node{
        Node pare;
        int valor;
        
        Node(Node pare, int valor){
            this.pare = pare;
            this.valor = valor;
        }
    }
}
