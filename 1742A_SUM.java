import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      boolean ok = (a+b == c) || (b+c == a) || (c+a == b);
      bw.write(ok ? "YES" : "NO");
      bw.newLine();
    }

    bw.flush();  // pushes out everything that's buffered
  }
}