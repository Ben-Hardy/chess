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
  Switches typically i,j indices we use with arrays to chess board locations.
  for example, 1,6 will translate to g7
*/
char *translateCoords(int i, int j) {
  char *coord = (char *)malloc(2 * sizeof(char));

  switch (j) {
  case 0:
    coord[0] = 'a';
    break;
  case 1:
    coord[0] = 'b';
    break;
  case 2:
    coord[0] = 'c';
    break;
  case 3:
    coord[0] = 'd';
    break;
  case 4:
    coord[0] = 'e';
    break;
  case 5:
    coord[0] = 'f';
    break;
  case 6:
    coord[0] = 'g';
    break;
  case 7:
    coord[0] = 'h';
    break;
  }

  switch (i) {
  case 0:
    coord[1] = '8';
    break;
  case 1:
    coord[1] = '7';
    break;
  case 2:
    coord[1] = '6';
    break;
  case 3:
    coord[1] = '5';
    break;
  case 4:
    coord[1] = '4';
    break;
  case 5:
    coord[1] = '3';
    break;
  case 6:
    coord[1] = '2';
    break;
  case 7:
    coord[1] = '1';
    break;
  }
  return coord;
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
  printf("   a  b  c  d  e  f  g  h \n");
}

void generateMoves(char team) {
  
}

int main(int argc, char *argv[]) {

  setupBoard();
  printBoard();
  printf("%s", board[0][4].occupant);
  printf("%s", translateCoords(1, 6));

  return 0;
}
