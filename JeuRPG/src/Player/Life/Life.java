// Package Life, contenant la classe qui gère la vie d'un joueur
package Player.Life;

import Player.Player;

public class Life {

    private Player player;

    public Life(Player player) {
        this.player = player;
    }

    // Méthode pour réduire les points de vie du joueur (attaque)
    public void moins(int attaque) {
        int newVie = this.player.getVie() - attaque;
        // On s'assure que les points de vie ne descendent pas en dessous de 0
        if (newVie < 0) newVie = 0;
        this.player.setVie(newVie);
    }

    // Méthode pour augmenter les points de vie du joueur (potion)
    public void plus(int potion) {
        int newVie = this.player.getVie() + potion;
        // On s'assure que les points de vie ne dépassent pas un maximum arbitraire, ici 100
        if (newVie > 100) newVie = 100;
        this.player.setVie(newVie);
    }

    @Override
    public String toString() {
        return "Life{" +
                "Points de vie = " + this.player.getVie() +
                '}';
    }
}