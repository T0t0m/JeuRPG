public class Life extends Player {

    private Player player;

    public Life(Player player) {
        this.player = player;
    }


    public void moins(int attaque) {
        int newvie = this.player.getVie() - attaque;
        this.player.setVie(newvie);
    }

    public void plus(int possion) {
        int newvie = this.player.getVie() + possion;
        this.player.setVie(newvie);
    }

    @Override
    public String toString() {
        return "Life{" +
                "new life =" + this.player.getVie() +
                '}';
    }
}
