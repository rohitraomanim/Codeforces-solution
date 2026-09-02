import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int s = sc.nextInt();

    for(int i = 0; i < s; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int n = sc.nextInt();

      int k = (n + a + b + c);
      int target = k / 3;

      if(k % 3 != 0 || a > target || b > target || c > target) {
        System.out.println("NO");
      }
      else {
        System.out.println("YES");
      }
    }
  }
}