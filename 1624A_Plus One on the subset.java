import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      int s = sc.nextInt();
      int a[] = new int[s];

      for(int j = 0; j < s; j++) {
        a[j] = sc.nextInt();
      }

      Arrays.sort(a);

      int max = a[a.length - 1];
      int min = a[0];

      int oper = max - min;

      System.out.println(oper);
    }
  }
}