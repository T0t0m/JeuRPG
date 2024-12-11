package Map.OutsideCity;

import Map.OutsideCity.Plains.BegynnelsePlain;
import Map.OutsideCity.Plains.EldoriaPlain;

import java.util.ArrayList;
import java.util.List;

public class OutsideManager {
    private List<OutsideBase> outsides;

    public OutsideManager() {
        outsides = new ArrayList<>();
        initialiserOutside(); // Charger les lieux
    }

    private void initialiserOutside() {
        // Ajouter des lieux
        outsides.add(new BegynnelsePlain());
        outsides.add(new EldoriaPlain());
    }

    // Trouver un lieu par son nom
    public OutsideBase trouverOutsideParNom(String nomOutside) {
        for (OutsideBase outside : outsides) {
            if (outside.getNomOutside().equalsIgnoreCase(nomOutside)) {
                return outside;
            }
        }
        return null; // Lieu non trouvé
    }

    // Afficher tous les lieux
    public void afficherLieux() {
        System.out.println("Liste des lieux disponibles :");
        for (OutsideBase outside : outsides) {
            System.out.println("- " + outside.getNomOutside());
        }
    }
}
