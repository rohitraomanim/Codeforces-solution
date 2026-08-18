import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();

      if (c % 2 == 0) {
    // When c is even, Anna needs strictly more buttons
    if (a > b) {
        System.out.println("First");
    } else {
        System.out.println("Second");
    }
  } else {
    // When c is odd, Anna just needs to tie or win (a >= b)
    if (a >= b) {
        System.out.println("First");
    } else {
        System.out.println("Second");
    }
}

    }
  }
}