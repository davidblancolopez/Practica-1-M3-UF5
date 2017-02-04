package practica.pkg1.m3.uf5;


public interface IPila<T> {

    public void afegir(T t);
    
    public T treure();
    
    public void buidar();
    
    public int mida();
    
    public T[] toArray(Class<T> t);
    
}
