public class Experience {

    Player player;
    private int level = 300;


    public Experience(Player player) {
        this.player = player;
    }

    public Boolean NiveauSuivant(Player player) {
        if (player.getXpPlayer() == level) {
            level += 200;
            return true;
        }
        return false;
    }

    public void gainExperience(int xp) {
        int nexXP = this.player.getXpPlayer() + xp;
        this.player.setXpPlayer(nexXP);
    }





}
