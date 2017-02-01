package practica.pkg1.m3.uf5;

public abstract class Figura {

    private String nom;

    public Figura(String nom) {
        this.nom = nom;
    }

    public Figura(){
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract double area();

    public abstract double perimetre();
}
