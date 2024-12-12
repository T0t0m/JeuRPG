package Map.City;

public class Vesperith extends CityBase {
    public Vesperith() {
        super(
                "Vesperith",
                "Depuis toujours, Vesperith est marquée par une malédiction insidieuse, un écho des ténèbres émanant de Castel. Située sur un nexus spirituel corrompu, la ville n’a jamais connu de paix véritable. Les brumes qui l’enveloppent sont empoisonnées par la magie noire, et ses habitants vivent dans une coexistence troublante avec les esprits tourmentés qui hantent chaque recoin.\n" +
                        "\n" +
                        "Les ruelles de Vesperith résonnent de murmures effrayants et de gémissements d’âmes perdues. Les ombres semblent prendre vie, et les rares voyageurs qui osent s’y aventurer parlent de visions terrifiantes et de rêves hantés. La corruption du château a transformé la ville en un lieu où le désespoir et la peur règnent en maîtres.\n" +
                        "\n" +
                        "Malgré cela, les habitants, résignés à leur sort, ont développé des rites sombres pour apaiser les esprits et contenir la corruption. L’Ordre de l’Éclipse, autrefois gardien de l’équilibre, lutte désormais pour empêcher les ténèbres de se propager davantage.\n" +
                        "\n" +
                        "Pour le héros, Vesperith est un défi ultime, une confrontation directe avec la malédiction qui ronge le royaume. La ville maudite cache peut-être des secrets qui pourraient inverser le cours du mal, mais à un prix que peu sont prêts à payer.");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Vesperith, Ville des ombres !");
    }
}
