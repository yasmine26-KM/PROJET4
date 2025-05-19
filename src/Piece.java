public class Piece {
    protected int row;
    protected int column;

    public Piece(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public boolean isValidMove(Position newPosition) {
        // Vérifie que la position reste sur l’échiquier (0 à 7)
        return newPosition.row >= 0 && newPosition.row < 8 &&
                newPosition.column >= 0 && newPosition.column < 8;
    }
}

