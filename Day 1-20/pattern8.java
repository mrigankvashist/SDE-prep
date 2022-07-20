import java.util.*;

public class pattern8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp = n-1;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
                System.out.print("*\t");
                sp--;
                System.out.println();


        }
        scn.close();

    }
}
