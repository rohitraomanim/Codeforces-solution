import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int s1 = sc.nextInt();
    int s2 = sc.nextInt();
    int s3 = sc.nextInt();
    int s4 = sc.nextInt();

    Set<Integer> colors = new HashSet<>();
    colors.add(s1);
    colors.add(s2);
    colors.add(s3);
    colors.add(s4);

    int distinct_count = colors.size();
    int result = 4 - distinct_count;

    System.out.println(result);
  }
}