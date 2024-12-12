package Map.City;

public class Araneth extends CityBase {
    public Araneth() {
        super(
                "Araneth",
                "Cachée au cœur d’une forêt dense et mystique, Araneth se dresse telle une oasis de savoir au milieu de la nature sauvage. Ses tours majestueuses surgissent entre les arbres centenaires, gravées de runes lumineuses qui pulsent doucement dans l’obscurité. Loin de Castel mais non loin d’Eldoria, Araneth est un refuge où la magie est étudiée avec discipline et révérence.\n" +
                        "\n" +
                        "Entourée d’un environnement enchanteur où la faune et la flore semblent imprégnées de magie, la citadelle est un lieu où l’homme et la nature coexistent en harmonie. Les apprentis mages parcourent les sentiers boisés pour collecter des ingrédients rares, tandis que des esprits protecteurs veillent sur les lieux.\n" +
                        "\n" +
                        "Les écoles de la Grande Académie d’Araneth sont réputées pour leur rigueur et leur excellence, attirant les étudiants les plus prometteurs. Ici, on enseigne tout, des sorts élémentaires aux enchantements complexes, mais aussi la maîtrise de la magie naturelle, un art unique à cette région.\n" +
                        "\n" +
                        "Bien qu’éloignée de la corruption de Castel, Araneth n’est pas à l’abri des dangers. Les forces obscures cherchent à saper ses protections magiques, attirées par sa proximité avec Eldoria et son savoir inestimable. Pour le héros, Araneth est une étape cruciale, un lieu où il pourra développer ses compétences, tout en faisant face à des dilemmes moraux et aux échos d’un mal qui ne cesse de s’étendre.");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Araneth, Citadelle des mages !");
    }
}
