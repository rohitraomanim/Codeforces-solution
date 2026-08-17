import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int l = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int p = sc.nextInt();
    int nl = sc.nextInt();
    int np = sc.nextInt();

    int ml =  k * l;
    int t = ml / nl;
    int li = d * c;
    int s = p / np;

    int res = (Math.min(t, Math.min(li , s)) ) / n;
    System.out.println(res);
  }
}