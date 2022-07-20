import java.util.Scanner;
public class digitsofno {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cnt = 0;
        int temp = n;
        while(temp>0){
            temp = temp/10;
            cnt++;
        }
        int div = (int)Math.pow(10,cnt-1);
        while(div>=1){
            int q = n/div;
            System.out.println(q);
            n = n%div;
            div = div/10;
        }
        scn.close();
    }
    
}
