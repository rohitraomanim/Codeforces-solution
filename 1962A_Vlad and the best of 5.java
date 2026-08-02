import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    for(int i = 0; i < n; i++) {
      int count = 0; int count1 = 0;
      String a = sc.nextLine();
      for(int j = 0; j < 5; j++) {
        if(a.charAt(j) == 'A') {
          count++;
        }
        if(a.charAt(j) == 'B') {
          count1++;
        }
      }

      if(count > count1) {
        System.out.println("A");
      }
      if(count1 > count) {
        System.out.println("B");
      }
    }
  }
}