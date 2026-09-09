import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = n / 5;
    int r = n % 5;

    if(r == 0) {
      System.out.println(q);
    }
    else {
      System.out.println(q+1);
    }
  }
}