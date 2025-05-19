public class test {
    public static void main(String[] args) {
        Reine reine = new Reine(2, 5); // Nouvelle position de départ

        System.out.println("Vers (2,7) - ligne droite : " + reine.isValidMove(new Position(2, 7)));
        System.out.println("Vers (0,3) - diagonale : " + reine.isValidMove(new Position(0, 3)));
        System.out.println("Vers (6,5) - colonne : " + reine.isValidMove(new Position(6, 5)));
        System.out.println("Vers (4,6) - déplacement invalide : " + reine.isValidMove(new Position(4, 6)));
        System.out.println("Vers (8,8) - hors échiquier : " + reine.isValidMove(new Position(8, 8)));
    }
}


