#include "headers/chess.h"

/*
    A simple function that sets up the board for the game. Time for lots of
    strncpying
*/
void setupBoard(void) {
  /*
      The top and bottom rows have to be set manually
      rkbQKbkr
      key:
          r: rook
          k: knight
          b: bishop
          Q: Queen
          K: King
  */

  strncpy(board[0][0].occupant, "br ", 3);
  strncpy(board[0][1].occupant, "bk ", 3);
  strncpy(board[0][2].occupant, "bb ", 3);
  strncpy(board[0][3].occupant, "bQ ", 3);
  strncpy(board[0][4].occupant, "bK ", 3);
  strncpy(board[0][5].occupant, "bb ", 3);
  strncpy(board[0][6].occupant, "bk ", 3);
  strncpy(board[0][7].occupant, "br ", 3);

  strncpy(board[7][0].occupant, "wr ", 3);
  strncpy(board[7][1].occupant, "wk ", 3);
  strncpy(board[7][2].occupant, "wb ", 3);
  strncpy(board[7][3].occupant, "wQ ", 3);
  strncpy(board[7][4].occupant, "wK ", 3);
  strncpy(board[7][5].occupant, "wb ", 3);
  strncpy(board[7][6].occupant, "wk ", 3);
  strncpy(board[7][7].occupant, "wr ", 3);

  /* fill in the pawns! */
  for (int i = 0; i < 8; i++) {
    strncpy(board[1][i].occupant, "bp ", 3);
    board[1][i].firstMove = TRUE;
    strncpy(board[6][i].occupant, "wp ", 3);
    board[6][i].firstMove = TRUE;
  }

  /* now to fill in all the empty space */
  for (int i = 2; i < 6; i++) {
    for (int j = 0; j < 8; j++) {
      strncpy(board[i][j].occupant, " . ", 3);
    }
  }
}

/*
    Prints out the board. I decided to include a-h and 1-8 so moves can be
    make using normal chess notation
*/
void printBoard(void) {
  printf("   a  b  c  d  e  f  g  h \n");
  for (int i = 0; i < 8; i++) {
    printf("%d ", 8 - i);
    for (int j = 0; j < 8; j++) {
      printf("%s", board[i][j].occupant);
    }
    printf(" %d\n", 8 - i);
  }
  printf("   a  b  c  d  e  f  g  h ");
}

int main(int argc, char *argv[]) {

  setupBoard();
  printBoard();
  return 0;
  
}
