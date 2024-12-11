// Package PNJ, contenant la classe définissant les attributs d'un PNJ
package PNJ;

// Définition de la classe Player, représentant un joueur dans le jeu
public class PNJ {
    // Attributs privés pour stocker les informations du joueur
    private String Nom;       // Le nom de famille du joueur
    private String Prenom;    // Le prénom du joueur

    // Constructeur par défaut, nécessaire si on souhaite créer un joueur sans initialiser les attributs tout de suite
    public PNJ() {}

    // Constructeur avec paramètres pour initialiser un joueur avec des valeurs spécifiques
    public PNJ(String nom, String prenom) {
        Nom = nom;           // Initialisation du nom de famille
        Prenom = prenom;     // Initialisation du prénom
    }

    // Getter pour obtenir le nom du joueur
    public String getNom() {
        return Nom;
    }

    // Setter pour modifier le nom du joueur
    public void setNom(String nom) {
        Nom = nom;
    }

    // Getter pour obtenir le prénom du joueur
    public String getPrenom() {
        return Prenom;
    }

    // Setter pour modifier le prénom du joueur
    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    // Méthode toString pour afficher les informations du joueur de manière lisible
    @Override
    public String toString() {
        return "PNJ{" +
                "Nom='" + Nom + '\'' +            // Affiche le nom du joueur
                ", Prenom='" + Prenom + '\'' +    // Affiche le prénom du joueur
                '}';
    }
}
