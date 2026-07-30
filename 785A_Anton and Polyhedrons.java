import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    HashMap<String, Integer> ab = new HashMap<String, Integer>();

    ab.put("Tetrahedron", 4);
    ab.put("Cube", 6);
    ab.put("Octahedron", 8);
    ab.put("Dodecahedron", 12);
    ab.put("Icosahedron", 20);

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();
    int total = 0;

    for(int i = 0; i < n; i++) {
      
      String a = sc.nextLine();
      total = total + ab.get(a);
    } 
    System.out.println(total);

  }
}