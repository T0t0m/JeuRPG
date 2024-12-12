package Map.City;

public class Eldoria extends CityBase {
    public Eldoria() {
        super(
                "Eldoria",
                "Perchée au bord d’un lac cristallin entouré de montagnes, Eldoria est un lieu de beauté mystique et intemporelle. Ses tours élégantes, faites d’un cristal scintillant, semblent capter et amplifier la lumière de la lune, donnant à la cité une aura éthérée.\n" +
                        "\n" +
                        "Berceau des anciens, Eldoria est imprégnée d’une magie ancestrale qui imprègne chaque pierre de ses rues et chaque souffle de vent. Les vastes bibliothèques de la cité abritent des parchemins oubliés et des artefacts d’un autre âge, gardés par les sages qui veillent à ce que leur pouvoir ne tombe pas entre de mauvaises mains.\n" +
                        "\n" +
                        "Bien que la cité semble paisible, elle porte le poids d’un passé marqué par de terribles conflits. Les habitants, descendants des anciens, surveillent avec vigilance les signes de retour des forces obscures. Eldoria est un sanctuaire de savoirs et un pilier du royaume, dont les secrets pourraient détenir la clé pour vaincre définitivement les ténèbres.");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Eldoria, La cité magique des anciens !");
    }
}
