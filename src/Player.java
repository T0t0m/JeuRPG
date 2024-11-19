public class Player {
    private String Nom;
    private String Prenom;
    private int vie;
    private int niveau;
    private int xpPlayer;

    public Player() {}
    public Player(String nom, String prenom, int vie, int niveau) {
        Nom = nom;
        Prenom = prenom;
        this.vie = vie;
        this.niveau = niveau;
        this.xpPlayer = 0;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getXpPlayer() {
        return xpPlayer;
    }

    public void setXpPlayer(int xpPlayer) {
        this.xpPlayer = xpPlayer;
    }

    @Override
    public String toString() {
        return "Player{" +
                "Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", vie=" + vie +
                ", niveau=" + niveau +
                '}';
    }
}
