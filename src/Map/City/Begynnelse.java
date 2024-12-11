// Ville de départ
package Map.City;

public class Begynnelse extends CityBase {
    public Begynnelse() {
        super(
                "Begynnelse",
                "Nichée au creux d’une vallée verdoyante, Begynnelse est une petite ville paisible où le quotidien suit le rythme des saisons. Ses rues pavées, bordées de maisons en pierre aux toits de chaume, débordent de vie et de chaleur. Le marché central, animé par les commerçants locaux, est le cœur de la communauté, où les habitants échangent rires et nouvelles.\n" +
                "\n" +
                "Connue pour son calme et son hospitalité, Begynnelse semble être un lieu à l’abri des tourments du monde. Pourtant, derrière cette tranquillité se cachent les premiers indices du mal qui menace le royaume. C’est ici que l’aventure commence, et que le héros prendra son premier pas vers un destin bien plus grand que ce que la ville paisible pourrait laisser imaginer.");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Begynnelse, Le Berceau de l’Aventure !");
    }
}
