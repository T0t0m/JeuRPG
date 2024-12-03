package Player.Level;

import Player.Player;

public class Experience {

    // Attribut pour stocker l'objet Player associé à l'expérience
    Player player;

    // Attribut pour stocker le niveau requis pour passer au niveau suivant
    private int level = 300;

    // Constructeur de la classe Experience qui initialise l'objet Player
    public Experience(Player player) {
        this.player = player;
    }

    // Méthode pour vérifier si le joueur a suffisamment d'expérience pour passer au niveau suivant
    public Boolean NiveauSuivant(Player player) {
        // Vérifie si l'expérience actuelle du joueur correspond au niveau requis
        if (player.getXpPlayer() == level) {
            // Augmente le seuil du niveau requis pour le prochain palier
            level += 200;
            return true; // Retourne vrai si le joueur peut passer au niveau suivant
        }
        return false; // Retourne faux si le joueur n'a pas assez d'expérience
    }

    // Méthode pour ajouter de l'expérience au joueur
    public void gainExperience(int xp) {
        // Calcule la nouvelle valeur d'expérience en ajoutant les points d'expérience gagnés
        int nexXP = this.player.getXpPlayer() + xp;
        // Met à jour l'expérience du joueur
        this.player.setXpPlayer(nexXP);
    }
}