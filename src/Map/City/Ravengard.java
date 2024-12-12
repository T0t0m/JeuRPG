package Map.City;

public class Ravengard extends CityBase {
    public Ravengard() {
        super(
                "Ravengard",
                "Située entre Arithar et Valendor, Ravengard est un lieu de front, une ville qui se dresse contre la progression de la corruption qui se répand lentement à travers le royaume. Stratégiquement placée, c'est le seul passage terrestre entre ces deux cités, un point crucial qui sépare encore le royaume de l'ombre grandissante. Cependant, contrairement à d'autres villes du royaume, Ravengard est pauvre, avec très peu de commerce et des ressources limitées. Sa survie repose principalement sur les efforts des rebelles qui l'habitent.\n" +
                        "\n" +
                        "Les habitants de Ravengard sont pour la plupart des soldats, des résistants, et des civils qui se battent pour empêcher la corruption de franchir les montagnes et envahir le royaume. Ils savent que si la ville tombe, la propagation du mal dans le royaume sera inévitable et rapide. Les rebelles, bien que déterminés, manquent de ressources, et la situation devient de plus en plus précaire. L'isolement de Ravengard, renforcé par les fortifications autour de la ville, n’empêche pas les attaques répétées des forces envoyées par les chefs corrompus d’Arithar, ce qui rend chaque victoire amère et chaque perte encore plus lourde.\n" +
                        "\n" +
                        "La Forteresse des Résistants est le cœur de la ville, où les stratégies de défense sont élaborées, et où les guerriers se préparent pour les attaques à venir. En dehors de la forteresse, la ville est composée de petites maisons de pierre, un mélange de campements et de refuges temporaires pour ceux qui fuient la corruption. La Place de la Résistance, bien que modeste, est le lieu où les rebelles se rassemblent pour organiser leur défense ou discuter des nouvelles concernant les autres régions du royaume.\n" +
                        "\n" +
                        "Bien que pauvre, Ravengard bénéficie du soutien stratégique de Valendor, qui reste un allié précieux. Les maîtres marchands de Valendor, en particulier, fournissent discrètement des ressources et des informations vitales aux rebelles, afin qu'ils puissent continuer leur lutte contre les forces corruptrices. Le commerce reste limité à l'essentiel : nourriture, médicaments et munitions, mais les rebelles savent que leur force réside dans leur détermination, et non dans la richesse.\n" +
                        "\n" +
                        "Ravengard est un lieu de résistance pure, où les habitants savent que chaque jour de survie est une victoire. Cependant, la tension est palpable, et bien que l’allié qu'est Valendor apporte un soutien, la situation devient de plus en plus désespérée. La ville tiendra-t-elle assez longtemps pour que l'aide externe arrive, ou succombera-t-elle face à l’assaut implacable des forces corruptrices d'Arithar ? Le sort du royaume pourrait se jouer ici, au cœur de cette dernière ligne de défense.");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Ravengard, Le bastion des rebelles !");
    }
}
