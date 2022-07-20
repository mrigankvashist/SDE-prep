import java.util.Scanner;
public class reversenum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n>0){
            int d = n%10;
            System.out.println(d);
            n = n/10;
        }
        scn.close();
    }
    
}