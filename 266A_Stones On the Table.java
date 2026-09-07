import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    
      String a = sc.nextLine();
      int count = 0;

      for(int i = 0; i < a.length() - 1; i++) {
        if(a.charAt(i) == a.charAt(i+1)) {
          count++;
        }
      }
      System.out.println(count);


  }
}