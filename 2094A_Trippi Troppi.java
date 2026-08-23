import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    for(int i = 0; i < n; i++) {
      String a = sc.nextLine();
      String txt[] = a.split(" ");

      for(int j = 0; j < txt.length; j++) {
        char s = txt[j].charAt(0);
        System.out.print(s);
      }
      System.out.println();
    }
  }
}