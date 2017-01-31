
package practica.pkg1.m3.uf5;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class infoClasse <T>{
   private T t1;
    
    public infoClasse(T t1){
        this.t1 = t1;
    }
    
    public String nomSuperClasse (){
        return t1.getClass().getSuperclass().getSimpleName();
    }
    
    // nom de la classe complet.
    public String nomClasseComplet (){
        return t1.getClass().getCanonicalName();
    }
    
    // només el nom de la classe.
    public String nomClasse(){
        return t1.getClass().getSimpleName();
    }
    
    // array d'atributs (Field).
    public Field[] arrayAtributs(){
        return t1.getClass().getDeclaredFields();
    }
 
    // array de mètodes (Method).
    public Method[] arrayMetodes(){
        return t1.getClass().getDeclaredMethods();
    }
    
    // array dels noms dels atributs.
    public String[] arrayNomsAtributs(){
        String[] nomAtributs = new String[arrayAtributs().length];
        Field[] att = arrayAtributs();
        for(int i = 0; i < nomAtributs.length; i++){
            nomAtributs[i] = att[i].getName();
        }        
        return nomAtributs;
    }
    
    // array dels noms dels mètodes.
    public String[] arrayNomsMetodes(){
        String[] nomMetodes = new String[arrayMetodes().length];
        Method[] meth = arrayMetodes();
        for (int i = 0; i < nomMetodes.length; i++) {
            nomMetodes[i] = meth[i].getName();
        }
        return nomMetodes;
    }
    
    // modificador d'un atribut.
    public int[] modificadorAtribut(){
        int[] modAtribut = new int[arrayMetodes().length];
        Method[] meth = arrayMetodes();
        for (int i = 0; i < modAtribut.length; i++) {
            modAtribut[i] = meth[i].getModifiers();
        }
        return modAtribut;
    }
    
    // modificador d'un mètode.
    public int[] modificadorMetode() {
        int[] modModificador = new int[arrayAtributs().length];
        Field[] field = arrayAtributs();
        for (int i = 0; i < modModificador.length; i++) {
            modModificador[i] = field[i].getModifiers();
        }
        return modModificador;
    }
    
    // modificar el valor d'un atribut.
    public void modificarValorAtribut(Field atribut, Object nouValor) throws IllegalArgumentException, IllegalAccessException {
        atribut.setAccessible(true);
        atribut.set(t1, nouValor);
    }
    
    // executar un dels seus mètodes.
    public void executarMetodes(Method metode) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        metode.setAccessible(true);
        metode.invoke(t1, null);
    }
    
    // crear una instància.
    public Object crearInstancia() throws InstantiationException, IllegalAccessException {
        return t1.getClass().newInstance();
    }
    
    // crear objecte clonat.
    

}
