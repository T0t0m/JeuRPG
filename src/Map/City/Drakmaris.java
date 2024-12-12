package Map.City;

public class Drakmaris extends CityBase {
    public Drakmaris() {
        super(
                "Drakmaris",
                "Autrefois un bastion de puissance et d’harmonie entre humains et dragons, Drakmaris n’est plus que l’ombre de sa gloire passée. Depuis que les ténèbres émanant du château maudit ont atteint ses terres, la forteresse s’est transformée en un lieu de chaos et de désolation.\n" +
                        "\n" +
                        "Les montagnes volcaniques qui entourent Drakmaris semblent s’être réveillées, crachant des cendres noires et plongeant la région dans une nuit perpétuelle. Les dragons, autrefois nobles et majestueux, ont été corrompus, devenant des créatures sauvages et destructrices. Les guerriers, submergés par une folie insidieuse, errent dans la forteresse comme des spectres.\n" +
                        "\n" +
                        "Malgré cela, quelques âmes résistantes se battent pour préserver ce qu’il reste de Drakmaris, cherchant désespérément un moyen de purifier la forteresse et de ramener ses habitants à la raison. Pour le héros, Drakmaris est un lieu de défis immenses, où il faudra affronter la corruption et raviver l’espoir perdu.");
    }

    //Encerclée par des montagnes volcaniques, Drakmaris se dresse telle une forteresse imposante, sculptée dans la pierre rougeoyante. Ses remparts gigantesques et ses tours fumantes témoignent de son rôle unique : un lieu où dragons et guerriers cohabitent et s’entraînent pour défendre le royaume.
    //
    //À l’intérieur de ses murs, l'air vibre du rugissement des dragons et du fracas des armes. Les cavaliers dragoniques perfectionnent leurs liens avec leurs montures légendaires, tandis que les apprentis forgerons créent des armes capables de résister aux flammes.
    //
    //Drakmaris est bien plus qu’une forteresse : c’est un symbole de puissance brute et d’alliance entre humains et créatures mythiques. Seuls les plus braves ou les plus dignes sont invités à franchir ses portes, prêts à affronter l’épreuve du feu et à embrasser leur destin.

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Drakmaris, Forteresse des dragons !");
    }
}
