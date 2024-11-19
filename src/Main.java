// Généré avec ChatGPT pour l'exemple

import java.util.Scanner;

import Player.Ressource.Ressource;

public class Main {
    public static void main(String[] args) {
        // Création de différentes ressources pour le joueur
        Ressource mana = new Ressource("Mana", 100);
        Ressource rage = new Ressource("Rage", 50);

        // Affichage de l'état initial des ressources
        System.out.println("Bienvenue dans le jeu RPG !");
        System.out.println("Voici l'état initial de vos ressources :");
        System.out.println(mana);
        System.out.println(rage);

        // Simulation d'interactions avec le joueur
        Scanner scanner = new Scanner(System.in);
        boolean jeuEnCours = true;

        while (jeuEnCours) {
            System.out.println("\nQue souhaitez-vous faire ?");
            System.out.println("1. Consommer du mana");
            System.out.println("2. Régénérer du mana");
            System.out.println("3. Consommer de la rage");
            System.out.println("4. Régénérer de la rage");
            System.out.println("5. Quitter le jeu");

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
