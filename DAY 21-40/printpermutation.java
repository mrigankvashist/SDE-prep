import java.util.*;

public class printpermutation {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str,"");
        scn.close();
    }

    public static void printPermutations(String str, String asf) {

        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            String lp = str.substring(0,i);
            String rp = str.substring(i+1);
            String tot = lp + rp;
            printPermutations(tot,asf+ch);
        }
        
    }

}