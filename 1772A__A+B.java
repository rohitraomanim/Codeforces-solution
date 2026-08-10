import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            
            String expr = sc.next();
          
            int a = expr.charAt(0) - '0';
            int b = expr.charAt(2) - '0';

            System.out.println(a + b);
        }
        
        sc.close();
    }
}
