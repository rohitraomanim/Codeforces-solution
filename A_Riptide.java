import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      int count = 0;
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      if(a == b || b == c || c == a) {
        System.out.println(0);
      }
      else{
        int high = Math.max(a, Math.max(b,c));
        int low = Math.min(a, Math.min(b,c));
        int mid = a + b + c - low - high;
        while(high != mid && low != mid) {
        low++;
        high--;
        count++;
      }
      System.out.println(count);
      }
    }
  }
}