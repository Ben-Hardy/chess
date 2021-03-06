package chess;

import java.util.ArrayList;

public class ChessBoard {
  // Arrays storing the pieces for both players
  private ArrayList<ChessPiece> white;
  private ArrayList<ChessPiece> black;

  private ArrayList<ChessPiece> wDead;
  private ArrayList<ChessPiece> bDead;

  // the board itself. It will be 8x8
  ChessSquare board[][];



  // Function to create and add pieces to the game.
  // name is the ID for the piece type, i and j are the array coords on the
  // board, and team is just a notifier for if it is a white or black piece
  public void createPiece(String name, int i, int j, int team) {
    ChessPiece temp = new ChessPiece(name, i, j);
    board[i][j].addPiece(temp);

    if (team == 1)
      black.add(temp);
    else
      white.add(temp);
  }

  public ChessBoard() {
    board = new ChessSquare[8][8];
    black = new ArrayList<ChessPiece>();
    white = new ArrayList<ChessPiece>();
    bDead = new ArrayList<ChessPiece>();
    wDead = new ArrayList<ChessPiece>();

    // time to build the board!
    // initialize as empty!
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        board[i][j] = new ChessSquare();
      }
    }

    // black pieces first!
    createPiece("br", 0, 0, 1);
    createPiece("bn", 0, 1, 1);
    createPiece("bb", 0, 2, 1);
    createPiece("bq", 0, 3, 1);
    createPiece("bk", 0, 4, 1);
    createPiece("bb", 0, 5, 1);
    createPiece("bn", 0, 6, 1);
    createPiece("br", 0, 7, 1);

    // add pawns!
    for (int i = 0; i < 8; i++) createPiece("bp", 1, i, 1);

    // now for the white pieces
    createPiece("wr", 7, 0, 2);
    createPiece("wn", 7, 1, 2);
    createPiece("wb", 7, 2, 2);
    createPiece("wq", 7, 3, 2);
    createPiece("wk", 7, 4, 2);
    createPiece("wb", 7, 5, 2);
    createPiece("wn", 7, 6, 2);
    createPiece("wr", 7, 7, 2);

    for (int i = 0; i < 8; i++) createPiece("wp", 6, i, 2);
  }

  // Prints out a formatted version of the board along with a chess coord grid
  public void printBoard() {
    System.out.println("   a  b  c  d  e  f  g  h  ");
    for (int i = 0; i < 8; i++) {
      System.out.print("" + (8 - i) + "  ");
      for (int j = 0; j < 8; j++) System.out.print(board[i][j].toString() + " ");
      System.out.print(" " + (8 - i));
      System.out.println();
    }
    System.out.println("   a  b  c  d  e  f  g  h  ");
  }

  public void move(String piecefrom, String to) {
	String piece = piecefrom.substring(0,0);
	int[] indices = ChessUtils.getIndices(piecefrom.substring(1, 2));
	
	
  }


}
