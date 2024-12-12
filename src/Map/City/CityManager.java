package Map.City;

import java.util.ArrayList;
import java.util.List;

public class CityManager {
    private List<CityBase> cities;

    public CityManager() {
        cities = new ArrayList<>();
        initialiserVilles(); // Charger les villes
    }

    private void initialiserVilles() {
        // Ajouter des villes
        cities.add(new Begynnelse());
        cities.add(new Valendor());
        cities.add(new Thaldrin());
        cities.add(new Ravengard());
        cities.add(new Eldoria());
        cities.add(new Araneth());
        cities.add(new Faeloria());
        cities.add(new Solara());
        cities.add(new Mystralis());
        cities.add(new Arithar());
        cities.add(new Drakmaris());
        cities.add(new Zephyria());
        cities.add(new Luminara());
        cities.add(new Vesperith());
        cities.add(new Umbraeth());
    }

    // Obtenir la ville de départ
    public CityBase getVilleDepart() {
        return cities.get(0); // Retourne la première ville
    }

    // Trouver une ville par son nom
    public CityBase trouverVilleParNom(String nomVille) {
        for (CityBase city : cities) {
            if (city.getNomCity().equalsIgnoreCase(nomVille)) {
                return city;
            }
        }
        return null; // Ville non trouvée
    }

    // Afficher la description d'une ville
    public void afficherDescriptionVille(String descriptionVille) {
        System.out.println(descriptionVille);
    }

    // Afficher toutes les villes
    public void afficherVilles() {
        System.out.println("Liste des villes disponibles :");
        for (CityBase city : cities) {
            System.out.println("- " + city.getNomCity());
        }
    }
}
