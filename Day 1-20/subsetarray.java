import java.io.BufferedReader;
import java.io.InputStreamReader;

public class subsetarray {

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }

    int limit = (int)Math.pow(2,n);
    for(int i =0;i<limit;i++){
       int temp = i;
       String s = "";
       //convert i to binary and use 0's and 1's to know if element is to be printed or not
       for(int j =n-1;j>=0;j--){
          int r = temp%2;
          temp = temp/2;
          if(r==0){
             s = "-\t"+ s;
          }
          else{
             s = arr[j] + "\t" + s;
          }
       }
       System.out.println(s);
    }

    
 }}
