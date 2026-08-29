import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int R = 8, C = 8;
    char[][] a = new char[R][C];

    for(int i = 0; i < n; i++) {

      for(int j = 0; j < R; j++) {
        String rowText = sc.next();
        for(int k = 0; k < C; k++) {
          a[j][k] = rowText.charAt(k);
        }
      }

      for(int j = 0; j < R; j++) {
      for(int k = 0; k < C; k++) {
        if(a[j][k] >= 'a' && a[j][k] <= 'z') {
          System.out.print(a[j][k]);
        }
      }
    }
    System.out.println();
    }

    
  }
}