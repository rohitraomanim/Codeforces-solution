import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        int count = 0;
        int count1 = 0;
        for(int i = 0; i < n; i++) {
            if(a.charAt(i) == 'A') {
                count++;
            }
            if(a.charAt(i) == 'D') {
                count1++;
            }
        }

        if(count > count1) {
            System.out.println("Anton");
        }
        else if(count <count1) {
            System.out.println("Danik");
        }
        else {
            System.out.println("Friendship");
        }
    }
}