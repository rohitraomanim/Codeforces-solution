import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int R = sc.nextInt();
    int C = sc.nextInt();
    int count = 0;

    char[][] M = new char[R][C];
    boolean isBW = false;

    for(int i = 0; i < R; i++) {
      for(int j = 0; j < C; j++) {
        M[i][j] = sc.next().charAt(0);

        if(M[i][j] == 'C' || M[i][j] == 'M' || M[i][j] == 'Y') {
          isBW = true;
        }
      }
    }

    if(isBW) {
      System.out.println("#Color");
    }
    else {
      System.out.println("#Black&White");
    }

  }
}