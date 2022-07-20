import java.util.Scanner;

public class isprime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        // brute force, O(N*T)
        // for(int i =0;i<t;i++){
        // int n = scn.nextInt();
        // int cnt = 0;
        // for(int div=2;div<n;div++){
        // if(n%div == 0){
        // cnt++;
        // }
        // }
        // if(cnt==0){
        // System.out.println("prime");
        // }
        // else System.out.println("not prime");
        // }
        // scn.close();
        // }

        // optimal, O(T* sqrtroot N)
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int div = 2;
            while (div * div <= n) {
                if (n % div == 0) {
                    break;
                } else
                    div++;
            }
            if (div * div > n) {
                System.out.println("prime");
            } else
                System.out.println("not prime");
        }
        scn.close();
    }
}
