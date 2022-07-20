import java.util.*;

public class inversenum{

public static void main(String[] args) {
  // write your code here  
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int pos = 1;
        int ans = 0;

        while(n>0){
          int d = n%10;
          ans+= pos* (int)Math.pow(10,d-1);
          pos++;
          n = n/10;
        }
        System.out.print(ans);
        scn.close();
 }
}
