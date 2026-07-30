import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int count = 0;
        int count1 = 0;

        for(int i = 0; i < a.length(); i++) {
            if(Character.isUpperCase(a.charAt(i))) {
                count++;
            }
            if(Character.isLowerCase(a.charAt(i))) {
                count1++;
            }
            
        }
        if(count > count1) {
            System.out.println(a.toUpperCase());
        }
        else {
            System.out.println(a.toLowerCase());
        }
        
    }
}