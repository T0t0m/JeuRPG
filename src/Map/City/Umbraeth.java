package Map.City;

public class Umbraeth extends CityBase {
    public Umbraeth() {
        super(
                "Umbraeth",
                "Perché au sommet d’un plateau escarpé, Umbraeth domine le paysage avec ses murailles noires et ses tours menaçantes qui semblent griffer le ciel. Jadis un symbole de prospérité et de justice, ce château majestueux est devenu le berceau du mal qui ronge le royaume. Ses pierres, imbibées de magie noire, vibrent d’une énergie sinistre, et une aura oppressante enveloppe les environs.\n" +
                        "\n" +
                        "Autour du château, des terres désolées s’étendent, marquées par la corruption. Les arbres morts et tordus, le sol craquelé et les rivières asséchées témoignent des ravages causés par le pouvoir sombre qui réside à l'intérieur.\n" +
                        "\n" +
                        "Les habitants murmurent des histoires terrifiantes sur Umbraeth : des cris inhumains qui résonnent dans la nuit, des silhouettes fantomatiques errant dans ses couloirs, et un trône maudit qui aurait corrompu son ancien seigneur.\n" +
                        "\n" +
                        "C’est ici que tout a commencé, et c’est ici que tout se terminera. Pour le héros, Umbraeth représente à la fois la destination ultime et l’épreuve la plus redoutable. Traverser ses sombres couloirs, affronter ses gardiens infernaux, et faire face à la source du mal exigera un courage et une détermination sans faille.\n" +
                        "\n" +
                        "La lumière reviendra-t-elle un jour sur ce lieu maudit, ou Umbraeth restera-t-il à jamais l’emblème de la ruine du royaume ?");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Umbraeth, Le Cœur de l’Ombre !");
    }
}
