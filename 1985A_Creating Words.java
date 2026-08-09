import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    for(int i = 0; i < n; i++) {
      String a = sc.next();
      String b = sc.next();

      String a1 = b.charAt(0) + a.substring(1);
      String b1 = a.charAt(0) + b.substring(1);

      System.out.println(a1+" "+b1);
    }
  }
}