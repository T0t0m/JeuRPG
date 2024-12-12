package Map.City;

public class Faeloria extends CityBase {
    public Faeloria() {
        super(
                "Faeloria",
                "Cachée dans un écrin de nature sauvage, Faeloria est une ville où l’harmonie règne entre la magie ancienne des druides et la vie florissante de la forêt. Les bâtiments, façonnés à partir de pierres et de racines vivantes, semblent fusionner avec les arbres et la végétation environnante, créant un sanctuaire serein et protégé. C’est ici que les druides, gardiens de l’équilibre naturel, veillent sur les forêts et les créatures magiques, dédiés à leur préservation.\n" +
                        "\n" +
                        "La ville est un bastion de sagesse et de guérison. Les druides y pratiquent des rituels sacrés, communiquant avec les éléments et les esprits de la nature pour maintenir l'harmonie dans le royaume. Les Cercles Sacrés, vastes clairières où les druides méditent et enseignent aux jeunes générations, sont des lieux de grande importance, où la magie de la terre est ressentie dans chaque souffle d'air et chaque mouvement de la végétation.\n" +
                        "\n" +
                        "Faeloria est un havre de paix, à l'abri de la corruption qui ravage d’autres régions du royaume. La distance entre Castel et ce sanctuaire naturel a permis à la ville de résister, du moins pour le moment, à l’influence grandissante des ténèbres. La magie druidique protège encore les forêts et les créatures magiques, mais un défi grandissant se profile.\n" +
                        "\n" +
                        "Le nombre de druides diminue à un rythme inquiétant. Nombre d'entre eux ont quitté Faeloria pour répondre à des appels à l'aide ailleurs, ou ont tout simplement choisi de se retirer. Les jeunes générations ne suivent plus le chemin de la sagesse ancestrale, et les anciens commencent à se faire rares. La protection de la nature et de la ville devient plus fragile chaque jour. Un jour viendra où, si Faeloria perd assez de druides pour défendre son équilibre, la corruption, pourtant éloignée, pourrait finalement s'y infiltrer.\n" +
                        "\n" +
                        "Pour le héros, Faeloria est un lieu de paix et de sagesse, mais aussi un avertissement. Tandis que la ville lutte pour maintenir son équilibre, un changement lent mais inéluctable pourrait laisser les portes ouvertes à la corruption. La mission du héros pourrait bien être de sauver non seulement Faeloria, mais la magie et la nature qui l'ont toujours protégée.");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Faeloria, Sanctuaire des druides !");
    }
}
