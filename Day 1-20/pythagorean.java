import java.util.*;

public class pythagorean {

    public static void main(String[] args) {
        // Write your code here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int h = Math.max(a, Math.max(b, c));
        int p, ba = 0;
        if (h == a) {
            ba = b;
            p = c;
        } else if (h == b) {
            ba = a;
            p = c;
        } else {
            ba = b;
            p = a;
        }
        if (h * h == p * p + ba * ba) {
            System.out.print("true");
        } else
            System.out.print("false");
        scn.close();
    }
}
