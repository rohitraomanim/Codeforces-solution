import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int n = sc.nextInt();
    int w = sc.nextInt();

    int cst = k * ( ( w * (w + 1) ) / 2);
    int res = cst - n;

    if(cst > n) {
      System.out.println(res);
    }
    else {
      System.out.println(0);
    }
  }
}