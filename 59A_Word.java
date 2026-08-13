import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      
      int count = 0, count1 = 0;

      for(int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if(Character.isUpperCase(c)) {
          count++;
        }
        else {
          count1++;
        }
      }
      if(count > count1) {
        System.out.println(s.toUpperCase());
      }
      else {
        System.out.println(s.toLowerCase());
      }
    }
 }
