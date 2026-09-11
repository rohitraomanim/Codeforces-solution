import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int count = 1;
    sc.nextLine();
    String current = "";

    for(int i = 0; i < n; i++) {
      String a = sc.nextLine();

      if(i > 0) {
        if(current.charAt(1) == a.charAt(0)) {
          count++;
        }
      }

      current = a;
    }
    System.out.println(count);
  }
}