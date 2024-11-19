# Exercice 1 ~ Mise en place de la structure du jeu

Vous allez créer une classe `Joueur` représentant le personnage principal du RPG. Cette classe devra inclure des champs pour les attributs du joueur tels que le nom, le niveau, les points de vie, etc. Vous allez également définir des méthodes pour initialiser ces attributs via un constructeur, ainsi que pour afficher les informations du joueur.

Ensuite, créez une classe principale `JeuRPG` qui utilisera la classe `Joueur` pour créer un personnage et l'afficher à l'écran. Introduisez des commentaires décrivant la structure de vos classes et expliquant le rôle de chaque méthode. Assurez-vous de démontrer la différence entre les types primitifs et les références d'objet en initialisant les attributs du joueur.

Cet exercice mettra en pratique la création de classes, la définition des champs et des méthodes, l'utilisation des constructeurs, ainsi que la distinction entre types primitifs et références d'objet.

Une fois que vous aurez terminé cet exercice, nous pourrons passer au chapitre suivant.

## Détails des classes

### Classe `Joueur`
Créez une classe nommée `Player` qui contient des champs pour représenter différents aspects du personnage du joueur tels que sa vie, son niveau, son nom, etc. Implémentez un constructeur pour initialiser ces champs et des méthodes pour afficher les informations du joueur.

### Classe `Ressource`
Créez une classe `Ressource` qui représente les ressources utilisées par le joueur. Chaque type de ressource (comme le mana, la rage, etc.) sera représenté par une instance de cette classe. Incluez des méthodes pour ajouter ou consommer ces ressources, tout en limitant les valeurs maximales et minimales pour chaque type.

### Classe `Life`
Développez une classe `Life` pour gérer les points de vie du joueur. Cette classe devrait inclure des méthodes pour ajouter ou retirer des points de vie, tout en gérant les limites maximales et minimales de la santé du joueur.

### Classe `Experience`
Développez une classe `Experience` pour gérer le gain d'expérience du joueur. Cette classe doit permettre d'ajouter de l'expérience au joueur, de vérifier s'il a atteint un certain seuil pour passer au niveau suivant et de mettre à jour le niveau du joueur en conséquence.

### Classe `Level`
Créez une classe `Level` pour représenter le niveau du joueur. Cette classe doit permettre d'augmenter le niveau du joueur et de définir des seuils pour passer au niveau suivant. Cette classe doit impérativement utiliser la classe `Experience`.

## Durée
2 jours
