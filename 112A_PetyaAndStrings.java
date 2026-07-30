import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        int r = a.compareToIgnoreCase(b);

        int nr = Integer.signum(r);

        System.out.println(nr);
    }
}