package practica.pkg1.m3.uf5;

import java.lang.reflect.Array;


public class PilaGenerica<T> implements IPila<T> {

    private Node node = null;
    private int mida = 0;

    /**
     * Metode que li arriba un tipus generic.
     * Afegeix el tipus a la pila.
     * @param t 
     */
    @Override
    public void afegir(T t) {
        node = new Node(node, t);
        mida++;
    }

    /**
     * Metode que treu un tipus.
     * Retorna el tipus que ha tret de la pila.
     * @return 
     */
    @Override
    public T treure() {
        T valor = null;
        if (node != null) {
            valor = (T) node.t;
            node = node.pare;       
            mida--;
        } 
        return valor;
    }

    /**
     * Metode que buida la pila.
     */
    @Override
    public void buidar() {
        node = null;
        mida = 0;
    }

    /**
     * Metode que retorna la mida de la pila.
     * @return 
     */
    @Override
    public int mida() {
        return mida;
    }

    /**
     * Metode que rep un tipus generic i el converteix a array.
     * Retorna l'array.
     * @param t
     * @return 
     */
    @Override
    public T[] toArray(Class t) {
         T[] llista = (T[]) Array.newInstance(t, mida);
        int x = mida; 
        Node aux = node;        
        while(aux != null){
            llista[--x] = (T) aux.t;
            aux = aux.pare;
        }
        return llista;
    }


    
    /**
     * Clase Node
     */
    private class Node {

        Node pare;
        T t;

        /**
         * Constructor del Node
         * @param pare
         * @param t 
         */
        Node(Node pare, T t) {
            this.pare = pare;
            this.t = t;
        }
    }
}
