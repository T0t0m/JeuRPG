package Map.City;

public class Solara extends CityBase {
    public Solara() {
        super(
                "Solara",
                "Nichée au creux d’une vallée baignée par un soleil éternel, Solara est un sanctuaire de paix et de renouveau. Cette ville lumineuse est connue dans tout le royaume pour ses fontaines curatives, dont l’eau, imprégnée d’une magie ancienne, guérit les blessures et apaise les âmes tourmentées.\n" +
                        "\n" +
                        "Les rues pavées de Solara sont bordées de jardins fleuris, où les guérisseurs cultivent des plantes rares utilisées dans l’élaboration de potions et d’onguents miraculeux. Les temples de soins, construits en pierre blanche étincelante, résonnent des prières et des chants des prêtres, qui canalisent l’énergie du soleil pour renforcer leurs pouvoirs de guérison.\n" +
                        "\n" +
                        "Solara est bien plus qu’un lieu de repos : c’est un phare d’espoir dans un royaume marqué par les ténèbres. Des blessés, des malades et des âmes désespérées affluent ici pour chercher des remèdes que seule la magie solaire peut offrir.\n" +
                        "\n" +
                        "Cependant, la ville est sous pression. L’ombre de Castel et la propagation de la corruption menacent ses fontaines sacrées. Les guérisseurs, autrefois pacifiques, se préparent à défendre leur sanctuaire, conscients que la perte de Solara serait une tragédie irréparable pour le royaume.\n" +
                        "\n" +
                        "Pour le héros, Solara est une escale cruciale, un lieu où il pourra récupérer, renforcer son esprit et apprendre des secrets sur les arts curatifs qui pourraient s’avérer indispensables dans sa quête.");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Solara, Ville des guérisseurs !");
    }
}
