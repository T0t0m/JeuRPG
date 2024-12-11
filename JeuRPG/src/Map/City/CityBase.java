package Map.City;

public abstract class CityBase {
    private String nom;

    public CityBase(String nom) {
        this.nom = nom;
    }

    public String getNomCity() {
        return nom;
    }

    public abstract void afficherBienvenue(); // Méthode spécifique à chaque ville
}
