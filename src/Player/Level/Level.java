package Player.Level;

import Player.Player;

public class Level extends Experience {

    // Attribut pour stocker l'objet Player associé au niveau
    private Object player;
    
    // Constructeur de la classe Level qui prend un objet Player en paramètre
    public Level(Player player) {
        super(player); // Appel du constructeur de la classe parent (Experience)
    }
    
    // Méthode pour gérer l'augmentation du niveau du joueur
    public void NiveauPlayer() {
        // Vérifie si le joueur a atteint le seuil pour passer au niveau suivant
        if (this.NiveauSuivant(this.player)) {
            // Augmente le niveau du joueur de 1
            int newNiveau = ((Player) this.player).getNiveau() + 1;
            ((Player) this.player).setNiveau(newNiveau);
        } else {
            // Message informatif si le joueur n'a pas assez d'expérience pour monter de niveau
            System.out.println("Le joueur n'a pas assez d'xp");
        }
    }
            
    // Méthode privée pour vérifier si le joueur peut passer au niveau suivant
    private boolean NiveauSuivant(Object player2) {
        // Indication que cette méthode n'a pas encore été implémentée
        // Elle devra inclure la logique pour déterminer si le joueur a assez d'expérience
        throw new UnsupportedOperationException("Unimplemented method 'NiveauSuivant'");
    }
}
