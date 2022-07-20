import java.util.Scanner;

//import java.util.Scanner;
public class primetilln {
    public static void main(String[] args) {
        // O(t* sqrtROOT n)
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int h = scn.nextInt();
        for (int n = l; n <= h; n++) {
            int div = 2;
            while(div*div<=n){
                if(n%div == 0){
                    break;
                }
                else div++;
            }
            if(div*div>n){
                System.out.println(n);
            }
        }
        scn.close();

    }
}
