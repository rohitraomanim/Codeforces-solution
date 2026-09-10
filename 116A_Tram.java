import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int c = 0, max_c = 0;

    while(n-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      c = c - a;
      c = c + b;
      max_c = Math.max(max_c, c);
    }
    System.out.println(max_c);
    sc.close();
  }
}