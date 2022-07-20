import java.util.Scanner;

public class fibotilln {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int ans = 0;
        while(n>0){
            ans = a+b;
            System.out.println(a);
            a = b;
            b = ans;
            n--;
        }
        scn.close();
    }
}