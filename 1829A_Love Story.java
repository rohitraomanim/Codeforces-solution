import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String s = "codeforces";

    int n = sc.nextInt();
    
    sc.nextLine();

    for(int i = 0; i < n; i++) {
      String a = sc.nextLine();
      int count = 0;
      for(int j = 0; j < 10; j++) {
      if(a.charAt(j) != s.charAt(j)) {
        count++;
      }
    }
    System.out.println(count);
  }
    
    
  }
}