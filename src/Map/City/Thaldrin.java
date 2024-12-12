package Map.City;

public class Thaldrin extends CityBase {
    public Thaldrin() {
        super(
                "Thaldrin",
                "Situé sur la côte d’une mer calme mais profonde, Thaldrin est un port animé, où les vagues frappent les quais bruyants et les navires venus des quatre coins du monde accostent pour décharger leurs précieuses cargaisons. Le port est un carrefour commercial incontournable, reliant le royaume aux terres lointaines et abritant une multitude de cultures et de marchandises rares.\n" +
                        "\n" +
                        "Les docks de Thaldrin sont constamment en effervescence, avec des commerçants hurlant leurs prix, des voleurs habiles à l’affût et des marchands étrangers offrant des trésors de toutes sortes. Les navires arrivent chargés d’épices exotiques, de métaux rares, de soieries précieuses et de reliques anciennes, apportant avec eux des histoires d’outre-mer et des marchandises d’une valeur inestimable.\n" +
                        "\n" +
                        "Au cœur du port se trouve la Grande Bourse de Thaldrin, un gigantesque bâtiment en bois sculpté, où les plus grands commerçants négocient des contrats et échangent des biens qui façonneront l’économie du royaume. Les marchands influents y possèdent des entrepôts privés, protégés par des gardes, et les plus audacieux se battent pour un accès privilégié aux ressources les plus convoitées.\n" +
                        "\n" +
                        "Mais Thaldrin est aussi un lieu de convoitise. Bien que prospère, la ville est le théâtre de rivalités commerciales et de tensions entre différentes factions. Les navires ne sont pas seulement porteurs de richesses, mais aussi de secrets et de dangers. Pour le héros, Thaldrin est une étape clé dans la quête des ressources rares et un endroit où les alliances comme les trahisons peuvent changer le cours de l’aventure.");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Thaldrin, Port marchand !");
    }
}
