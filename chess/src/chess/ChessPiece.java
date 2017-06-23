package chess;

public class ChessPiece {
  private String name;
  private Boolean hasMoved;
  private int i;
  private int j;
  private Boolean alive;

  public ChessPiece(String name, int i, int j) {
    hasMoved = false;
    alive = true;
    this.name = name;
    this.i = i;
    this.j = j;
  }

  public void setLocation(int i, int j) {
    this.i = i;
    this.j = j;
  }

  public int[] getLocations() {
    int ret[] = {i, j};
    return ret;
  }

  public int getI() {
    return i;
  }

  public int getJ() {
    return j;
  }

  public String getName() {
    return name;
  }

  public Boolean hasMoved() {
    return hasMoved == true;
  }

  public Boolean isAlive() {
    return alive;
  }

  public void kill() {
    alive = false;
    i = -1;
    j = -1;
  }

  public String getCoords() {
    return ChessBoard.getCoords(i, j);
  }

  @Override
  public String toString() {
    return name + this.getCoords();
  }
}
