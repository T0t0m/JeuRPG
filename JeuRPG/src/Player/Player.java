// Package Player, contenant la classe définissant les attributs d'un joueur
package Player;

// Définition de la classe Player, représentant un joueur dans le jeu
public class Player {
    // Attributs privés pour stocker les informations du joueur
    private String Nom;       // Le nom de famille du joueur
    private String Prenom;    // Le prénom du joueur
    private int vie;          // La vie actuelle du joueur (points de vie)
    private int niveau;       // Le niveau du joueur dans le jeu
    private int xpPlayer;     // Les points d'expérience du joueur (xp)

    // Constructeur par défaut, nécessaire si on souhaite créer un joueur sans initialiser les attributs tout de suite
    public Player() {}

    // Constructeur avec paramètres pour initialiser un joueur avec des valeurs spécifiques
    public Player(String nom, String prenom, int vie, int niveau) {
        Nom = nom;           // Initialisation du nom de famille
        Prenom = prenom;     // Initialisation du prénom
        this.vie = vie;      // Initialisation de la vie
        this.niveau = niveau; // Initialisation du niveau
        this.xpPlayer = 0;   // Initialisation des points d'expérience à 0 par défaut
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

    // Getter pour obtenir la vie actuelle du joueur
    public int getVie() {
        return vie;
    }

    // Setter pour modifier la vie du joueur
    public void setVie(int vie) {
        this.vie = vie;
    }

    // Getter pour obtenir le niveau du joueur
    public int getNiveau() {
        return niveau;
    }

    // Setter pour modifier le niveau du joueur
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    // Getter pour obtenir les points d'expérience du joueur
    public int getXpPlayer() {
        return xpPlayer;
    }

    // Setter pour modifier les points d'expérience du joueur
    public void setXpPlayer(int xpPlayer) {
        this.xpPlayer = xpPlayer;
    }

    // Méthode toString pour afficher les informations du joueur de manière lisible
    @Override
    public String toString() {
        return "Player{" +
                "Nom='" + Nom + '\'' +            // Affiche le nom du joueur
                ", Prenom='" + Prenom + '\'' +    // Affiche le prénom du joueur
                ", vie=" + vie +                  // Affiche les points de vie du joueur
                ", niveau=" + niveau +            // Affiche le niveau du joueur
                ", xpPlayer=" + xpPlayer +        // Affiche les points d'expérience du joueur
                '}';
    }
}