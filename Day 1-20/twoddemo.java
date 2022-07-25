import java.util.*;

public class twoddemo {

  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int m = scn.nextInt();
    int n = scn.nextInt();

    int[][] a = new int[m][n];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        a[i][j] = scn.nextInt();
      }
    }

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
      scn.close();

    }
  }
}
