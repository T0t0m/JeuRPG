package Map.City;

public abstract class CityBase {
    private String nom;
    private String description;

    public CityBase(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public String getNomCity() {
        return nom;
    }

    public String getDescriptionCity() {
        return description;
    }

    public abstract void afficherBienvenue(); // Méthode spécifique à chaque ville
}
