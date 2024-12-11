// Généré avec ChatGPT pour l'exemple

import java.util.Scanner;

import Map.City.CityBase;
import Map.City.CityManager;

import Map.OutsideCity.OutsideBase;
import Map.OutsideCity.OutsideManager;

import Player.Player;
import Player.Life.Life;
import Player.Ressource.Ressource;

public class Main {
    public static void main(String[] args) {
        // Création du joueur avec des valeurs initiales
        Player joueur = new Player("John", "Doe", 100, 1); // Nom, Prénom, vie, niveau
        Life vieJoueur = new Life(joueur);

        // Création des ressources du joueur
        Ressource mana = new Ressource("Mana", 100);
        Ressource rage = new Ressource("Rage", 50);

        // Initialisation et affichage des informations de départ
        System.out.println("Bienvenue dans le jeu RPG !");
        System.out.println("Voici l'état initial de vos ressources :");
        System.out.println(mana);
        System.out.println(rage);
        System.out.println("Points de vie du joueur : " + joueur.getVie());

        // Gestion des villes
        CityManager cityManager = new CityManager();
        CityBase villeActuelle = cityManager.getVilleDepart();

        System.out.println("\nVous commencez à " + villeActuelle.getNomCity() + " !");
        villeActuelle.afficherBienvenue();

        // Gestion des lieux
        OutsideManager outsideManager = new OutsideManager();
        OutsideBase lieuActuel = null;

        // Début du jeu
        Scanner scanner = new Scanner(System.in);
        boolean jeuEnCours = true;

        while (jeuEnCours) {
            System.out.println("\nQue souhaitez-vous faire ?");
            if (villeActuelle != null) {
                System.out.println("\nVous êtes en ville : " + villeActuelle.getNomCity());
                System.out.println("1. Changer de ville");
                System.out.println("2. Afficher la description de la ville");
                System.out.println("3. Sortir de la ville");
                System.out.println("4. Quitter le jeu");
            } else if (lieuActuel != null) {
                System.out.println("\nVous êtes dans le lieu : " + lieuActuel.getNomOutside());
                System.out.println("1. Retourner en ville");
                System.out.println("2. Quitter le jeu");
            } else {
                // Menu complet si le joueur est hors des villes
                System.out.println("1. Consommer du mana");
                System.out.println("2. Régénérer du mana");
                System.out.println("3. Consommer de la rage");
                System.out.println("4. Régénérer de la rage");
                System.out.println("5. Subir une attaque (réduire les points de vie)");
                System.out.println("6. Utiliser une potion (régénérer des points de vie)");
                System.out.println("7. Entrer dans une ville");
                System.out.println("8. Quitter le jeu");
            }

            int choix = scanner.nextInt();

            // Logique du jeu
            if (villeActuelle != null) {
                switch (choix) {
                    case 1:
                        cityManager.afficherVilles();
                        System.out.print("Entrez le nom de la ville : ");
                        scanner.nextLine();
                        String nomVille = scanner.nextLine();
                        CityBase villeTrouvee = cityManager.trouverVilleParNom(nomVille);
                        if (villeTrouvee != null) {
                            villeActuelle = villeTrouvee;
                        } else {
                            System.out.println("Ville introuvable !");
                        }
                        break;
                    case 2:
                        cityManager.afficherDescriptionVille();
                        break;
                    case 3:
                        outsideManager.afficherLieux();
                        System.out.print("Entrez le nom du lieu : ");
                        scanner.nextLine();
                        String nomOutside = scanner.nextLine();
                        OutsideBase lieuTrouvee = outsideManager.trouverOutsideParNom(nomOutside);
                        if (lieuTrouvee != null) {
                            villeActuelle = null;
                            lieuActuel = lieuTrouvee;
                        } else {
                            System.out.println("Lieu introuvable !");
                        }
                        break;
                    case 4:
                        jeuEnCours = false;
                        break;
                    default:
                        System.out.println("Choix invalide.");
                }
            } else if (lieuActuel != null) {
                switch (choix) {
                    case 1:
                        villeActuelle = cityManager.getVilleDepart();
                        lieuActuel = null;
                        break;
                    case 2:
                        jeuEnCours = false;
                        break;
                    default:
                        System.out.println("Choix invalide.");
                }
            } else {
                // Actions disponibles hors des villes
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
                        villeActuelle = cityManager.getVilleDepart();
                        System.out.println("Vous entrez dans la ville de " + villeActuelle.getNomCity());
                        villeActuelle.afficherBienvenue();
                        break;
                    case 8:
                        System.out.println("Merci d'avoir joué !");
                        jeuEnCours = false;
                        break;
                    default:
                        System.out.println("Choix invalide. Veuillez réessayer.");
                }
            }
        }

        scanner.close();
    }
}
