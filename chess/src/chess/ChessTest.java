package chess;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChessTest {
  @Test
  public void PieceTest() {
    ChessPiece p = new ChessPiece("Q", 1, 1);
    assertEquals(p.getI(), 1);
    assertEquals(p.getJ(), 1);
    assertEquals(p.getName(), "Q");
    assertEquals(p.getCoords(), "b7");
    p.setLocation(6, 5);
    assertEquals(p.getCoords(), "f2");
    assertEquals(p.toString(), "Qf2");
    assertEquals(p.hasMoved(), false);
  }

  @Test
  public void squareTest() {
    // empty square tests!
    ChessSquare s = new ChessSquare();
    assertEquals(s.isOccupied(), false);
    assertEquals(s.getPiece(), null);
    assertEquals(s.toString(), ". ");

    // filling an empty square!
    ChessPiece p = new ChessPiece("Q", 6, 5);
    s.addPiece(p);
    assertEquals(s.isOccupied(), true);
    assertEquals(s.getPiece(), p);
    assertEquals(s.toString(), "Q");

    // emptying a square!
    s.removePiece();
    assertEquals(s.isOccupied(), false);
    assertEquals(s.getPiece(), null);
    assertEquals(s.toString(), ". ");
  }

  @Test
  public void boardTest() {
    ChessBoard b = new ChessBoard();
    // probe a few board squares to make sure the board is populated correctly
    assertEquals(b.board[0][0].getPiece().getName(), "br");
    assertEquals(b.board[2][2].getPiece(), null);
  }
}
