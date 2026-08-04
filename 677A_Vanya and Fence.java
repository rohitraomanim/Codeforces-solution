import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int h = sc.nextInt();
    ArrayList<Integer> no = new ArrayList<>();
    int count = 0;

    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      no.add(a);

      if(a > h) {
        count = count + 2;
      }
      else {
        count++;
      }
    }
    System.out.println(count);
    
  }
}