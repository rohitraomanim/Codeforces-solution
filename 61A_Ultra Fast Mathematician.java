import java.util.*;
import java.math.BigInteger;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String a = sc.nextLine();
    String b = sc.nextLine();

    BigInteger num = new BigInteger(a, 2);
    BigInteger num1 = new BigInteger(b, 2);

    int maxlen = Math.max(a.length(), b.length());

    BigInteger res = num.xor(num1);
    String res1 = res.toString(2);
    String paddedRes = String.format("%" + maxlen + "s", res1).replace(' ', '0');
    System.out.println(paddedRes);
  }
}