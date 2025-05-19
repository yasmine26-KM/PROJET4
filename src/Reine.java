public class Reine extends Piece {

    public Reine(int row, int column) {
        super(row, column); // Appel au constructeur de Piece
    }

    @Override
    public boolean isValidMove(Position newPosition) {

        if (!super.isValidMove(newPosition)) {
            return false;
        }

        //  Vérifie les mouvements de la Reine
        boolean sameRow = this.row == newPosition.row;
        boolean sameCol = this.column == newPosition.column;
        boolean diagonal = Math.abs(this.row - newPosition.row) == Math.abs(this.column - newPosition.column);

        return sameRow || sameCol || diagonal;
    }
}