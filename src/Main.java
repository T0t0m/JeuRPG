// Généré avec ChatGPT pour l'exemple

import java.util.Scanner;
import Player.Player;
import Player.Life.Life;
import Player.Ressource.Ressource;

public class Main {
    public static void main(String[] args) {
        // Création du joueur avec des valeurs initiales
        Player joueur = new Player("John", "Doe", 100, 1);  // Nom, Prénom, vie, niveau

        // Création de l'objet Life pour gérer les points de vie du joueur
        Life vieJoueur = new Life(joueur);

        // Création de différentes ressources pour le joueur
        Ressource mana = new Ressource("Mana", 100);
        Ressource rage = new Ressource("Rage", 50);

        // Affichage de l'état initial des ressources et des points de vie
        System.out.println("Bienvenue dans le jeu RPG !");
        System.out.println("Voici l'état initial de vos ressources :");
        System.out.println(mana);
        System.out.println(rage);
        System.out.println("Points de vie du joueur : " + joueur.getVie());

        // Simulation d'interactions avec le joueur
        Scanner scanner = new Scanner(System.in);
        boolean jeuEnCours = true;

        while (jeuEnCours) {
            System.out.println("\nQue souhaitez-vous faire ?");
            System.out.println("1. Consommer du mana");
            System.out.println("2. Régénérer du mana");
            System.out.println("3. Consommer de la rage");
            System.out.println("4. Régénérer de la rage");
            System.out.println("5. Subir une attaque (réduire les points de vie)");
            System.out.println("6. Utiliser une potion (régénérer des points de vie)");
            System.out.println("7. Quitter le jeu");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Combien de mana souhaitez-vous consommer ? ");
                    int quantiteManaConsommee = scanner.nextInt();
                    mana.consommer(quantiteManaConsommee);
                    System.out.println("Mana après consommation : " + mana);
                    break;
                case 2:
                    System.out.print("Combien de mana souhaitez-vous régénérer ? ");
                    int quantiteManaRegenerée = scanner.nextInt();
                    mana.regenerer(quantiteManaRegenerée);
                    System.out.println("Mana après régénération : " + mana);
                    break;
                case 3:
                    System.out.print("Combien de rage souhaitez-vous consommer ? ");
                    int quantiteRageConsommee = scanner.nextInt();
                    rage.consommer(quantiteRageConsommee);
                    System.out.println("Rage après consommation : " + rage);
                    break;
                case 4:
                    System.out.print("Combien de rage souhaitez-vous régénérer ? ");
                    int quantiteRageRegenerée = scanner.nextInt();
                    rage.regenerer(quantiteRageRegenerée);
                    System.out.println("Rage après régénération : " + rage);
                    break;
                case 5:
                    System.out.print("Combien de points de vie souhaitez-vous perdre ? ");
                    int pointsPerdus = scanner.nextInt();
                    vieJoueur.moins(pointsPerdus);
                    System.out.println("Points de vie après l'attaque : " + joueur.getVie());
                    break;
                case 6:
                    System.out.print("Combien de points de vie souhaitez-vous récupérer avec une potion ? ");
                    int pointsGagnes = scanner.nextInt();
                    vieJoueur.plus(pointsGagnes);
                    System.out.println("Points de vie après utilisation de la potion : " + joueur.getVie());
                    break;
                case 7:
                    System.out.println("Merci d'avoir joué !");
                    jeuEnCours = false;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }

        scanner.close();
    }
}
