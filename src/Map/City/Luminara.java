package Map.City;

public class Luminara extends CityBase {
    public Luminara() {
        super(
                "Luminara",
                "Perchée sur un plateau baigné par les rayons dorés d’un soleil éternel, Luminara resplendit tel un joyau au cœur du royaume. Ses murs d’albâtre et ses tours scintillantes semblent capturer la lumière, la renvoyant sous forme d’un halo protecteur visible à des lieues à la ronde.\n" +
                "\n" +
                "Connue comme la gardienne des artefacts lumineux, la cité abrite le Sanctuaire de l’Aube, où reposent les reliques sacrées capables de repousser les ténèbres. Les rues de Luminara sont parcourues par des prêtres, des érudits et des guerriers de l’Ordre du Soleil, tous dévoués à la préservation de cette lumière sacrée.\n" +
                "\n" +
                "Siège d’un pouvoir incommensurable, Luminara est bien plus qu’une cité ; elle est l’ultime rempart du royaume contre les forces obscures, et une lueur d’espoir pour tous ceux qui luttent contre le mal.");
    }

    @Override
    public void afficherBienvenue() {
        System.out.println("Bienvenue à Luminara, Cité de la lumière !");
    }
}
