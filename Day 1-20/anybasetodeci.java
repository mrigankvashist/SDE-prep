import java.util.*;

public class anybasetodeci {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
        scn.close();
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int rv = 0;
        int d = 0;
        int m = 1;
        while (n > 0) {
            d = n % 10;
            n = n / 10;
            rv += d * m;
            m = m * b;
        }
        return rv;
    }
}