package chess;

public class ChessSquare {
  private Boolean occupied;
  private ChessPiece piece;

  public ChessSquare() {
    piece = null;
    occupied = false;
  }

  public ChessSquare(ChessPiece p) {
    piece = p;
    occupied = true;
  }

  public void removePiece() {
    piece = null;
    occupied = false;
  }

  public Boolean isOccupied() {
    return occupied;
  }

  public ChessPiece getPiece() {
    return piece;
  }

  public void addPiece(ChessPiece piece) {
    this.piece = piece;
    this.occupied = true;
  }

  @Override
  public String toString() {
    if (occupied)
      return piece.getName();
    else
      return ". ";
  }
}
