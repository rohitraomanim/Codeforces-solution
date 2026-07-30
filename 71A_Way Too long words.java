import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    for(int i = 1; i <= n; i++) {
      String a = sc.nextLine();
      int l = a.length();

      if(l > 10) {
        System.out.println(a.charAt(0)+""+(l-2)+""+a.charAt(l-1));
      }
      else {
        System.out.println(a);
      }
    }
  }
}