import java.util.*;

public class anybaseaddition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getSum(int b, int n1, int n2) {
        // write ur code here

        int c = 0; // carry
        int p = 1;
        int rv = 0;

        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = d1 + d2 + c; // n1's last digit + n2's last digit + carry
            c = d / b; // carry = this digit's sum divided by base
            d = d % b; // digit left is d mod base

            rv += d * p; // adding this left over digit with 10^digit index 
            p = p * 10;
        }
        return rv;
    }
}