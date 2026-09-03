import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = Integer.toString(n);
            
            int ans = (s.length() - 1) * 9 + Character.getNumericValue(s.charAt(0));
            System.out.println(ans);
        }
        sc.close();
    }
}
