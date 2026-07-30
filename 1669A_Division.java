import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if(a >= 1900) {
      System.out.println("Division 1");
    }
    if(a >= 1600 && a <= 1899) {
      System.out.println("Division 2");
    }
    if(a >= 1400 && a <= 1599) {
      System.out.println("Division 3");
    }
    if(a <= 1399) {
      System.out.println("Division 4");
    }
  }
    
}
}