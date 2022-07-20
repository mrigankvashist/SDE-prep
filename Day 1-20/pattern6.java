import java.util.*;

public class pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp = 1;
        int st = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            // System.out.println(st +" "+sp+" "+st);
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            System.out.println();

            if (i <= n / 2) {
                sp += 2;
                st--;
            } else {
                sp -= 2;
                st++;
            }
        }
        scn.close();
    }
}