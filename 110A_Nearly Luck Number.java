import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int count = 0;

        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == '4' || a.charAt(i) == '7') {
                count++;
            }
        }

        int temp = count;
        boolean isLucky = true;

        if(temp == 0) {
            isLucky = false;
        }

        while(temp > 0) {
            int digit = temp % 10;
            if(digit != 4 && digit != 7) {
                isLucky = false;
            }
            temp = temp / 10;
        }

        if(isLucky) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}