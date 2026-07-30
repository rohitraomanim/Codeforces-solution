import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long fn;

    if(n % 2 == 0) {
      fn = n/2;
    }
    else{
      fn = -((n+1)/2);
    }

    System.out.println(fn);
  }
}