import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    StringBuilder res = new StringBuilder();

    for(int i = 1; i <= n; i++) {
      if(i % 2 != 0) {
        res.append("I hate");
      }
      else {
        res.append("I love");
      }

      if(i == n) {
        res.append(" it");
      }
      else {
        res.append(" that ");
      }
    }
    System.out.println(res);
    sc.close();
  }
}