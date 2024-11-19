public class Level extends Experience {


    public Level(Player player) {
        super(player);
    }

    public void NiveauPlayer() {
        if (this.NiveauSuivant(this.player)){
            int newNiveau = this.player.getNiveau() + 1;
            this.player.setNiveau(newNiveau);
        }
        System.out.println("Le joueur n'a pas assez d'xp");
    }





}
