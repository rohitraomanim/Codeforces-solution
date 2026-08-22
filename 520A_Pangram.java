import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();  

    String s = sc.nextLine();
    String upper = s.toUpperCase();

    String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    boolean isPangram = true;

    for(int i = 0; i < a.length(); i++) {
      char letter = a.charAt(i);
      if(upper.indexOf(letter) == -1) {
        isPangram = false;
        break;
      }
    }

    System.out.println(isPangram ? "YES" : "NO");
  }
}