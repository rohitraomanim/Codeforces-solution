import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int l = sc.nextInt();
    int b = sc.nextInt();
    int year = 0;

    while(l <= b) {
      l *= 3;
      b *= 2;

      year++;
    }
    System.out.println(year);
  }
}