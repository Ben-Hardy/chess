package chess;

public class ChessUtils {
	  /*
    Switches typical i,j indices we use with arrays to chess board locations.
    for example, 1,6 will translate to g7

    static so the function can be used in other contexts
  */
  public static String getCoords(int i, int j) {
    StringBuilder s = new StringBuilder();

    switch (j) {
      case 0:
        s.append('a');
        break;
      case 1:
        s.append('b');
        break;
      case 2:
        s.append('c');
        break;
      case 3:
        s.append('d');
        break;
      case 4:
        s.append('e');
        break;
      case 5:
        s.append('f');
        break;
      case 6:
        s.append('g');
        break;
      case 7:
        s.append('h');
        break;
    }
    switch (i) {
      case 0:
        s.append('8');
        break;
      case 1:
        s.append('7');
        break;
      case 2:
        s.append('6');
        break;
      case 3:
        s.append('5');
        break;
      case 4:
        s.append('4');
        break;
      case 5:
        s.append('3');
        break;
      case 6:
        s.append('2');
        break;
      case 7:
        s.append('1');
        break;
    }
    return s.toString();
  }
  
  /*
   * Switches chess coordinates to i,j indices
   */
  public static int[] getIndices(String coords) {
	  int[] res = new int[2];
	  char first = coords.charAt(0);
	  char second = coords.charAt(1);
	  
	  switch (first) {
	  case 'a':
		  res[1] = 0;
		  break;
	  case 'b':
		  res[1] = 1;
		  break;
	  case 'c':
		  res[1] = 2;
		  break;
	  case 'd':
		  res[1] = 3;
		  break;
	  case 'e':
		  res[1] = 4;
		  break;
	  case 'f':
		  res[1] = 5;
		  break;
	  case 'g':
		  res[1] = 6;
		  break;
	  case 'h':
		  res[1] = 7;
		  break;
	  }
	  
	  switch (second) {
	  case '8':
		  res[0] = 0;
		  break;
	  case '7':
		  res[0] = 1;
		  break;
	  case '6':
		  res[0] = 2;
		  break;
	  case '5':
		  res[0] = 3;
		  break;
	  case '4':
		  res[0] = 4;
		  break;
	  case '3':
		  res[0] = 5;
		  break;
	  case '2':
		  res[0] = 6;
		  break;
	  case '1':
		  res[0] = 7;
		  break;
	  }
	  
	  return res;
	}
}