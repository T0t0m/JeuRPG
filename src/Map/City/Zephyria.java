package Map.City;

public class Zephyria extends CityBase {
    public Zephyria() {
        super(
                "Zephyria",
                "Perchée au-dessus des nuages, Zephyria est une cité légendaire, suspendue dans les cieux grâce à la magie ancestrale et la maîtrise des vents. Ses bâtiments flottants, construits à partir de matériaux légers et enchantés, semblent danser avec les courants aériens, créant une vue spectaculaire de la terre en dessous. Les rues de la ville sont bordées de ponts suspendus, de balcons suspendus dans le vide et de tours élancées, où les habitants vivent en harmonie avec les vents qui les portent.\n" +
                        "\n" +
                        "Les citoyens de Zephyria sont des maîtres du vol et de la navigation aérienne. Depuis leur plus jeune âge, ils sont formés aux arts du pilotage, que ce soit sur des aéronefs magiques, des griffons ou d'autres créatures ailées. Les Académies des Vents, où sont enseignées les techniques de navigation aérienne, sont l'un des points d'attraction de la ville, et seuls les plus prometteurs peuvent obtenir le titre de Maître du Ciel.\n" +
                        "\n" +
                        "Zephyria est une ville de découvertes et d'explorations. Les habitants, souvent des aventuriers et des érudits, parcourent les cieux à la recherche de nouveaux horizons, de terres oubliées et de trésors célestes. Les marchés flottants, où les marchandises sont échangées dans une brise légère, offrent des artefacts rares, des cartes anciennes et des remèdes venus de lointaines régions du ciel.\n" +
                        "\n" +
                        "Cependant, la vie dans les cieux n'est pas sans danger. Les vents impétueux, les tempêtes magiques et les créatures volantes hostiles menacent régulièrement la ville. De plus, certains secrets enfouis dans les nuages et les hauteurs des cieux sont parfois liés à la magie ancienne qui maintient la ville en suspension, et la stabilité de Zephyria pourrait être remise en question si ces secrets étaient découverts.\n" +
                        "\n" +
                        "Pour le héros, Zephyria représente un lieu d'émerveillement, mais aussi de risques. Naviguer dans les cieux et comprendre les mystères qui maintiennent la ville flottante pourrait être la clé pour débloquer des secrets anciens et résoudre des conflits cachés dans les vents.");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Zephyria, Ville volante !");
    }
}
