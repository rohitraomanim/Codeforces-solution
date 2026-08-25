import java.util.*;

public class MaximumMultipleSum {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();

      if(a == 3) {
        System.out.println("3");
      } 
      else {
        System.out.println("2");
      }
    }
  }
}