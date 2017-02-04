package practica.pkg1.m3.uf5;

public class Quadrat extends Figura {

    private double midaCostat;

    /**
     * constructor de Quadrat.
     * @param midaCostat
     * @param nom 
     */
    public Quadrat(int midaCostat, String nom) {
        super(nom);
        this.midaCostat = midaCostat;
    }

    /**
     * Metode que retorna la mida dels costats.
     * @return 
     */
    public double getMidaCostat() {
        return midaCostat;
    }

    /**
     * Metode que canvia la mida dels costats. 
     * @param midaCostat 
     */
    public void setMidaCostat(double midaCostat) {
        this.midaCostat = midaCostat;
    }

    /**
     * Metode que calcula l'area del quadrat.
     * @return 
     */
    @Override
    public double area() {
        return Math.pow(midaCostat, 2);
    }

    /**
     * Metode que calcula el perimetre.
     * @return 
     */
    @Override
    public double perimetre() {
        return 4 * midaCostat;
    }

    @Override
    public String toString() {
        return "Quadrat: " + "midaCostat = " + midaCostat;
    }

}
