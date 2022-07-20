import java.util.*;

public class pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write your code here
        // COMBINATION : i C j+1 = (i C j)*(i-j)/(j+1) #can get next combination based
        // on the previous val
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int icj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + "\t");
                int icjp1 = icj * (i - j) / (j + 1);
                icj = icjp1;
            }
            System.out.println();

        }
        scn.close();

    }
}
