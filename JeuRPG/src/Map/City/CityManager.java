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
        cities.add(new Eldoria());
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

    // Afficher toutes les villes
    public void afficherVilles() {
        System.out.println("Liste des villes disponibles :");
        for (CityBase city : cities) {
            System.out.println("- " + city.getNomCity());
        }
    }
}
