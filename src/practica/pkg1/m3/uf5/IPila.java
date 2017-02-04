package practica.pkg1.m3.uf5;


public interface IPila<T> {

    /**
     * Metode que afegeix un tipus generic.
     * @param t 
     */
    public void afegir(T t);
    
    /**
     * Metode que treu un tipus generic.
     * Retorna el tipus generic que ha tret.
     * @return 
     */
    public T treure();
    
    /**
     * Metode que buida la pila.
     */
    public void buidar();
    
    /**
     * Retorna la mida de lapila.
     * @return 
     */
    public int mida();
    
    /**
     * Metode que transforma la pila en un array.
     * Retorna l'array.
     * @param t
     * @return 
     */
    public T[] toArray(Class<T> t);
    
}
