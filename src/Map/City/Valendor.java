package Map.City;

public class Valendor extends CityBase {
    public Valendor() {
        super(
                "Valendor",
                "Située au croisement des plus grandes routes du royaume, Valendor est une ville foisonnante de vie et d’activité. Ses marchés colorés s’étendent à perte de vue, où les cris des marchands rivalisent avec les sons exotiques des instruments de rue. Ici, on peut trouver des épices des terres lointaines, des tissus précieux, des armes d’exception, et des artefacts rares venus des confins du monde.\n" +
                        "\n" +
                        "La ville est un véritable melting-pot culturel, accueillant des voyageurs de toutes origines. Ses tavernes animées regorgent d’histoires, et ses places publiques sont souvent le théâtre de spectacles et de négociations animées.\n" +
                        "\n" +
                        "Au centre de Valendor se dresse la Halle Dorée, un imposant bâtiment où les guildes marchandes se réunissent pour fixer les règles du commerce et résoudre les conflits. Si la prospérité est la marque de la ville, elle attire aussi des intrigues politiques et des contrebandiers en quête de profit.\n" +
                        "\n" +
                        "Pour le héros, Valendor est un lieu d’opportunités, où des alliances peuvent être forgées, des objets puissants trouvés, mais aussi des ennemis dissimulés derrière des sourires avenants.");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Valendor, Capitale des marchands !");
    }
}
