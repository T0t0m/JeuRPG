// Package Life, contenant la classe qui gère la vie d'un monstre
package PNJ.Monster.Life;

import PNJ.Monster.Monster;

public class Life {

    private Monster monster;

    public Life(Monster monster) {
        this.monster = monster;
    }

    // Méthode pour réduire les points de vie du monstre (attaque)
    public void moins(int attaque) {
        int newVie = this.monster.getVie() - attaque;
        // On s'assure que les points de vie ne descendent pas en dessous de 0
        if (newVie < 0) newVie = 0;
        this.monster.setVie(newVie);
    }

    @Override
    public String toString() {
        return "Life{" +
                "Points de vie = " + this.monster.getVie() +
                '}';
    }
}