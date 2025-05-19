# PROJET4
 # Structure du projet

 projet/
├── Position.java       # Classe représentant une position (ligne, colonne)
├── Piece.java          # Classe de base pour toute pièce d’échecs
├── Reine.java          # Classe Reine qui hérite de Piece
└── Test.java           # Classe avec tests unitaires simples

# Fonctionnalités
Vérification que la position cible est dans les limites de l’échiquier (0 à 7).
Validation du déplacement spécifique de la Reine :
déplacement en ligne (horizontal)
déplacement en colonne (vertical)
déplacement en diagonale
Utilisation de la méthode super.isValidMove pour réutiliser la validation de la classe parente.

# Auteurs
Projet réalisé par KAMARA.
