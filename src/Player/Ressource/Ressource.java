package Player.Ressource;

public class Ressource {
    // Champ pour le type de la ressource (e.g., "Mana", "Rage")
    private String type;
    
    // Quantité actuelle de la ressource
    private int valeurActuelle;
    
    // Quantité maximale que la ressource peut atteindre
    private int valeurMaximale;

    // Constructeur qui initialise la ressource avec un type et une valeur maximale
    public Ressource(String type, int valeurMaximale) {
        this.type = type;
        this.valeurMaximale = valeurMaximale;
        this.valeurActuelle = valeurMaximale; // La ressource commence avec sa valeur maximale
    }

    // Getter pour le type de la ressource
    public String getType() {
        return type;
    }

    // Getter pour la quantité actuelle de la ressource
    public int getValeurActuelle() {
        return valeurActuelle;
    }

    // Setter pour la quantité actuelle de la ressource
    // Assure que la valeur reste entre 0 et la valeur maximale
    public void setValeurActuelle(int valeurActuelle) {
        if (valeurActuelle < 0) {
            this.valeurActuelle = 0; // Empêche que la valeur soit négative
        } else if (valeurActuelle > valeurMaximale) {
            this.valeurActuelle = valeurMaximale; // Empêche que la valeur dépasse la limite
        } else {
            this.valeurActuelle = valeurActuelle; // Assigne la valeur dans les limites acceptables
        }
    }

    // Getter pour la valeur maximale de la ressource
    public int getValeurMaximale() {
        return valeurMaximale;
    }

    // Setter pour la valeur maximale de la ressource
    // Ajuste la valeur actuelle si elle dépasse la nouvelle valeur maximale
    public void setValeurMaximale(int valeurMaximale) {
        this.valeurMaximale = valeurMaximale;
        if (valeurActuelle > valeurMaximale) {
            valeurActuelle = valeurMaximale; // Ajuste la valeur actuelle si nécessaire
        }
    }

    // Méthode pour consommer une quantité de la ressource
    public void consommer(int quantite) {
        // Diminue la valeur actuelle en utilisant le setter pour rester dans les limites
        setValeurActuelle(this.valeurActuelle - quantite);
    }

    // Méthode pour régénérer une quantité de la ressource
    public void regenerer(int quantite) {
        // Augmente la valeur actuelle en utilisant le setter pour rester dans les limites
        setValeurActuelle(this.valeurActuelle + quantite);
    }

    // Méthode toString pour afficher l'état de la ressource
    @Override
    public String toString() {
        return type + ": " + valeurActuelle + "/" + valeurMaximale;
    }

    // Exemple d'utilisation de la classe Ressource
    public static void main(String[] args) {
        // Création d'une instance de Ressource de type "Mana" avec une valeur maximale de 100
        Ressource mana = new Ressource("Mana", 100);
        System.out.println(mana); // Affiche l'état initial

        // Consommation de 20 unités de mana
        mana.consommer(20);
        System.out.println("Après consommation : " + mana);

        // Régénération de 10 unités de mana
        mana.regenerer(10);
        System.out.println("Après régénération : " + mana);
    }
}
