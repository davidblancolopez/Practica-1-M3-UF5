package practica.pkg1.m3.uf5;

public abstract class Figura implements Comparable<Figura>{

    private String nom;

    /**
     * Constructor de figura
     * @param nom 
     */
    public Figura(String nom) {
        this.nom = nom;
    }

    /**
     * Constructor de figura per sobrecarrega
     */
    public Figura() {

    }

    /**
     * Retorna el nom
     * @return 
     */
    public String getNom() {
        return nom;
    }

    /**
     * Cambia el nom
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Metode abstracte per calcular l'area.
     * @return 
     */
    public abstract double area();

        /**
     * Metode abstracte per calcular el perimetre.
     * @return 
     */
    public abstract double perimetre();

    /**
     * Metode que rep un objecte y el compara amb un objecte actual.
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Figura o) {
        double areaObjecteActual = this.area(), areaObjecteParametre = o.area();
        return areaObjecteActual > areaObjecteParametre ? 1
                : areaObjecteActual == areaObjecteParametre ? 0 : -1;
    }

    @Override
    public String toString() {
        return "Figura{" + "nom=" + nom + '}';
    }
}
