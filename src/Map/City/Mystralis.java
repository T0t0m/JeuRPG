package Map.City;

public class Mystralis extends CityBase {
    public Mystralis() {
        super(
                "Mystralis",
                "Perchée dans un dédale de montagnes escarpées, Mystralis est une cité mystérieuse, un sanctuaire où reposent les savoirs anciens et les secrets interdits. Les montagnes qui l'entourent sont protégées par des enchantements puissants, rendant l'accès à la ville presque impossible pour ceux qui ne sont pas destinés à y pénétrer. Les visiteurs doivent traverser des passages secrets, déjouer des illusions magiques et déchiffrer des énigmes anciennes pour parvenir jusqu'à Mystralis, un lieu où la connaissance et le pouvoir sont concentrés mais soigneusement dissimulés.\n" +
                        "\n" +
                        "Les archives de Mystralis, protégées par des sorts de protection et des créatures mystiques, renferment les savoirs oubliés, les arts interdits et les rituels anciens qui ont été effacés de l’histoire du monde. Ce lieu est la demeure des érudits et des chercheurs les plus sages, qui consacrent leur vie à la préservation de ces connaissances. Les Chambres des Archives, un labyrinthe de bibliothèques infinies, regorgent de grimoires anciens, de parchemins magiques et de textes interdits, dont certains détiennent le pouvoir de changer l’équilibre du royaume.\n" +
                        "\n" +
                        "Seuls les élus, ceux jugés dignes par les Gardiens du Savoir, peuvent entrer dans les lieux les plus profonds de la cité. Ces gardiens, d’anciens mages et érudits, veillent sur les archives et sur les secrets cachés. L’accès à certaines connaissances est accordé avec une grande parcimonie, et ceux qui cherchent à découvrir des savoirs trop dangereux risquent de tomber dans des pièges de magie noire ou de s’attirer la malédiction des archives oubliées.\n" +
                        "\n" +
                        "Mystralis est un endroit où le temps semble suspendu, où les mystères du monde sont à portée de main, mais où les conséquences de la recherche du savoir peuvent être profondes et irrémédiables. Pour le héros, la cité représente à la fois un lieu de révélations et un défi moral. Les secrets qu’il y découvrira pourraient bien changer le cours de l’histoire, mais à quel prix ?");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Mystralis, La cité des secrets !");
    }
}
