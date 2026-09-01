import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while(t-- > 0) {
      int n = sc.nextInt();
      int count = 0, count1 = 0;

      for(int i = 0; i < n; i++) {
        int w = sc.nextInt();

        if(w == 1) {
          count++;
        }
        else {
          count1++;
        }
      }
      
      int total_w = (count * 1) + (count1 * 2);

      if(total_w % 2 != 0) {
        System.out.println("NO");
      }
      else {
        if(count1 % 2 != 0 && count < 2) {
          System.out.println("NO");
        }
        else {
          System.out.println("YES");
        }
      }
    }
  }
}