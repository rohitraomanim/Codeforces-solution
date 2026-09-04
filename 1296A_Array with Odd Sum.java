import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    while(n-- > 0) {
      int t = sc.nextInt();
      int a[] = new int[t];
      int sum = 0;
      int even = 0;
      int odd = 0;

      for(int i = 0; i < t; i++) {
        a[i] = sc.nextInt();

        sum += a[i];

        if(a[i] % 2 == 0) {
          even++;
        }
        else {
          odd++;
        }
      }

      if(sum % 2 != 0) {
        System.out.println("YES");
      }
      else if(odd > 0 && even > 0) {
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }
}