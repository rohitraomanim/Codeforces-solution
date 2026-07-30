import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        char b = a.charAt(0);

        System.out.println(Character.toUpperCase(b)+""+a.substring(1,a.length()));
    }
}