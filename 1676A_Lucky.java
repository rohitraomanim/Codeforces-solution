import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt();

    for(int i = 0; i < r; i++) {
      int n = sc.nextInt();
      int s = 0, s1 = 0;

      int b = n / 1000;
      int c = n % 1000;

      while(b > 0) {
        s = s + (b % 10);
        b = b / 10;
      }
      while(c > 0) {
        s1 = s1 + (c % 10);
        c = c / 10;
      }

      if(s == s1) {
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }
}