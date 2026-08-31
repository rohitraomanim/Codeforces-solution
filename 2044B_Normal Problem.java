import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    for(int i = 0; i < n; i++) {
      String res = "";
      String rev = "";
      String a = sc.nextLine();

      for(int j = 0; j < a.length(); j++) {
        char curr = a.charAt(j);
        if(curr == 'p') {
        res += 'q';
        }
        else if(curr == 'q') {
        res += 'p';
        }
        else {
        res += curr;
        }
      }

          for(int k = res.length() - 1; k >= 0; k--) {
            rev += res.charAt(k);
          }

           System.out.println(rev);
    }
    
  }
}