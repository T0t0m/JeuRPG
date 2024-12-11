package PNJ.Monster.Level;

import PNJ.Monster.Monster;
import Player.Player;  // Importer la classe Player

import java.util.Random;

public class Level {

    // Attribuer un niveau aléatoire au monstre basé sur le niveau du joueur
    public void assignRandomLevel(Monster monster, Player player) {
        Random random = new Random();

        // Récupérer le niveau du joueur
        int niveauJoueur = player.getNiveau();

        // Calculer les bornes du niveau du monstre : 5 niveaux en plus ou moins
        int minLevel = Math.max(1, niveauJoueur - 5);  // Le niveau ne peut pas être inférieur à 1
        int maxLevel = niveauJoueur + 5;

        // Générer un niveau aléatoire dans cet intervalle
        int randomLevel = random.nextInt(maxLevel - minLevel + 1) + minLevel;
        monster.setNiveau(randomLevel);

        System.out.println("Le monstre a été assigné au niveau : " + randomLevel);
    }
}
