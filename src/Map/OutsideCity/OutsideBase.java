package Map.OutsideCity;

public abstract class OutsideBase {
    private String nom;

    public OutsideBase(String nom) {
        this.nom = nom;
    }

    public String getNomOutside() {
        return nom;
    }

    public abstract void afficherLieu(); // Méthode spécifique à chaque lieu
}
