import java.util.*;
   
   public class rotatenum{
   
   public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int cnt = 0;
        int temp = n;
        while(temp!=0){
          temp = temp/10;
          cnt++;
        }

        k = k%cnt;
        if(k<0){
          k = k + cnt;
        }

        int mult =1;
        int div = 1;
        for(int i =1;i<=cnt;i++){
          if(i<=k){
            div*=10;
          }
          else mult*=10;
        }

        int rem = n%div;
        int quot = n/div;
        int ans = rem*mult + quot;
        System.out.print(ans);
        
        scn.close();


    }
   }