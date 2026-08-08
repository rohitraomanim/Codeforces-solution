import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int count = 0, count1 = 0;

    for(int i = 0; i < n; i++) {
      int m = sc.nextInt();
      int c = sc.nextInt();

      if(m > c) {
        count++;
      }
      if(c > m) {
        count1++;
      }
    }

    if(count > count1) {
      System.out.println("Mishka");
    }
    else if(count1 > count) {
      System.out.println("Chris");
    }
    else {
      System.out.println("Friendship is magic!^^");
    }
  }
}