import java.util.Scanner;

public class countdig {
    public static void main(String[] args) {
        // write your code here
        int cnt = 0;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            cnt++;
        }
        System.out.println(cnt);
        scn.close();
    }
}
