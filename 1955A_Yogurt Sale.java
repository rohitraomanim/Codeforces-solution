import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for(int i = 0; i < t; i++) {
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();

      int cost = n * a;
      int cost1 = 0;

      if(n == 1) {
        System.out.println(a);
      }

      if(n >= 2) {
        if(n % 2 == 0) {
          cost1 = (n / 2) * b;
        }
        else {
          int c = n - 1;
          if(c == 2) {
            cost1 = ((n - c) * a) + (1 * b);
          }
          else {
            cost1 = ((n - c) * a) + ((c / 2) * b);
          }
        }
        System.out.println(Math.min(cost, cost1));
      }

      //System.out.println(Math.min(cost, cost1));
    }
  }
}