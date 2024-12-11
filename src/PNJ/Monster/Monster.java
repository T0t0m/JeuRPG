package PNJ.Monster;

public class Monster {
        private int vie;          // La vie actuelle du monstre (points de vie)
        private int niveau;       // Le niveau du monstre dans le jeu

        // Constructeur par défaut, nécessaire si on souhaite créer un monstre sans initialiser les attributs tout de suite
        public Monster() {}

        // Constructeur avec paramètres pour initialiser un monstre avec des valeurs spécifiques
        public Monster(int vie, int niveau) {
            this.vie = vie;      // Initialisation de la vie
            this.niveau = niveau; // Initialisation du niveau
        }

        // Getter pour obtenir la vie actuelle du monstre
        public int getVie() {
            return vie;
        }

        // Setter pour modifier la vie du monstre
        public void setVie(int vie) {
            this.vie = vie;
        }

        // Getter pour obtenir le niveau du monstre
        public int getNiveau() {
            return niveau;
        }

        // Setter pour modifier le niveau du monstre
        public void setNiveau(int niveau) {
            this.niveau = niveau;
        }

        // Méthode toString pour afficher les informations du monstre de manière lisible
        @Override
        public String toString() {
            return "Monster{" +
                    ", vie=" + vie +                  // Affiche les points de vie du monstre
                    ", niveau=" + niveau +            // Affiche le niveau du monstre
                    '}';
        }
}
