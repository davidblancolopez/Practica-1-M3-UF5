package practica.pkg1.m3.uf5;

public abstract class Figura implements Comparable<Figura>{

    private String nom;

    public Figura(String nom) {
        this.nom = nom;
    }

    public Figura() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract double area();

    public abstract double perimetre();

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
