package Map.City;

public class Eldoria extends CityBase {
    public Eldoria() {
        super("Eldoria");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Eldoria, la cité magique des anciens !");
    }
}
