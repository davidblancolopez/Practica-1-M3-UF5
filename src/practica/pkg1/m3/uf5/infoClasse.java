
package practica.pkg1.m3.uf5;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class infoClasse <T>{
   private Class<T> t1;
    
   /**
    * Constructor de la clase.
    * @param t1 
    */
    public infoClasse(Class<T> t1){
        this.t1 = t1;
    }
    
    /**
     * Metode que retorna el nom de la superclase.
     * @return 
     */
    public String nomSuperClasse (){
        return t1.getClass().getSuperclass().getSimpleName();
    }
    
    /**
     * Metode que retorna el nom de la clase complet.
     * @return 
     */
    public String nomClasseComplet (){
        return t1.getClass().getCanonicalName();
    }
    
    /**
     * Metode que retorna el nom de la clase.
     * @return 
     */
    public String nomClasse(){
        return t1.getClass().getSimpleName();
    }
    
    /**
     * Metode que retorna un array d'atributs.
     * @return 
     */
    public Field[] arrayAtributs(){
        return t1.getClass().getDeclaredFields();
    }
 
    /**
     * Metode que retorna un array de metodes.
     * @return 
     */
    public Method[] arrayMetodes(){
        return t1.getClass().getDeclaredMethods();
    }
    
    /**
     * Metode que retorna un array d'atributs.
     * @return 
     */
    public String[] arrayNomsAtributs(){
        String[] nomAtributs = new String[arrayAtributs().length];
        Field[] att = arrayAtributs();
        for(int i = 0; i < nomAtributs.length; i++){
            nomAtributs[i] = att[i].getName();
        }        
        return nomAtributs;
    }
    
    /**
     * Metode que retorna un array amb els noms dels metodes.
     * @return 
     */
    public String[] arrayNomsMetodes(){
        String[] nomMetodes = new String[arrayMetodes().length];
        Method[] meth = arrayMetodes();
        for (int i = 0; i < nomMetodes.length; i++) {
            nomMetodes[i] = meth[i].getName();
        }
        return nomMetodes;
    }
    
    /**
     * Metode que crea una instancia del tipus generica.
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public Object crearInstancia() throws InstantiationException, IllegalAccessException {
        return t1.getClass().newInstance();
    }
    
    /**
     * Metode que crea un clon de l'objecte. 
     * @return
     * @throws CloneNotSupportedException 
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
