import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      int x = sc.nextInt();
      String a = sc.next();
      String b = sc.next();

      boolean isR = true;

      for(int j = 0; j < x; j++) {

        if(a.charAt(j) == 'R' && b.charAt(j) == 'R') {
          continue;
        } 
        else if(a.charAt(j) == 'R' || b.charAt(j) == 'R') {
          isR = false;
          break;
        }
      }

      if(isR) {
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
    sc.close();
  }
}