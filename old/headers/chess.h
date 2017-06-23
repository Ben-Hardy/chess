#ifndef _CHESS_
#define _CHESS_

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

struct square {
  /* this three character string will store either " . " or two characters
     followed by a space, like "wp " */
  char occupant[3];
  int firstMove;
};

/*
    a simple structure for keeping track of which pawns have done first moves
    or not.
*/
struct pawn {
  int hasMoved;
  int x;
  int y;
};

struct square board[8][8];

struct move {
  int starti;
  int startj;
  int endi;
  int endj;
  char piece;
};

struct move availableMoves[100];

#endif
