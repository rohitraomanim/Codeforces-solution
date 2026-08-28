import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while(t-- > 0) {
      int n = sc.nextInt();
      int x = sc.nextInt();

      if(n <= 2) {
        System.out.println("1");
      }      
      else {
        int rem_flr = n - 2;
        int add_flr = (rem_flr + x - 1) / x;

        System.out.println(1 + add_flr);
      }
    }
    sc.close();
  }
}