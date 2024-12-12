package Map.City;

public class Arithar extends CityBase {
    public Arithar() {
        super(
                "Arithar",
                "Autrefois un symbole de courage et de discipline, Arithar est désormais un bastion rongé par la corruption. Depuis trois ans, la forteresse est officiellement tombée sous l'influence des ténèbres, les chevaliers qui la composaient jadis devenant des instruments d’un pouvoir maléfique. Le vent du changement a soufflé silencieusement pendant plus de quinze ans, avec des rumeurs persistantes de trahisons et de pactes secrets, mais ce n'est que récemment que la vérité a éclaté au grand jour.\n" +
                        "\n" +
                        "Les murs d'Arithar, autrefois imprenables, sont désormais marqués par des symboles obscurs, témoignant de l’infiltration des forces du mal. Les chevaliers qui, jadis, se tenaient prêts à défendre le royaume, sont désormais de loyaux serviteurs d’une ombre grandissante, certains devenus des marionnettes sans âme, d’autres des dirigeants tyranniques. La Salle des Épreuves, autrefois un lieu sacré de formation et de préparation, est aujourd'hui le théâtre de rituels sombres, où les jeunes chevaliers sont initiés non pas à l'honneur, mais à des pratiques interdites.\n" +
                        "\n" +
                        "Malgré cela, quelques vestiges de l’ancienne gloire d’Arithar persistent. Un petit groupe de chevaliers révoltés, appelés les \"Légendes Perdues\", résiste dans l’ombre, cherchant à exposer la corruption et à restaurer l’intégrité de leur ordre. Mais ils sont traqués sans relâche par leurs anciens frères d'armes.\n" +
                        "\n" +
                        "Pour le héros, Arithar est un lieu de confrontation avec l'une des plus grandes trahisons du royaume. Le chevalier noble qu’il rencontrera ici pourrait aussi bien être un allié qu'un ennemi, et chaque pas dans la forteresse pourrait le conduire plus près de la vérité ou le plonger plus profondément dans la corruption qui l'habite.");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Arithar, Bastion des chevaliers !");
    }
}
