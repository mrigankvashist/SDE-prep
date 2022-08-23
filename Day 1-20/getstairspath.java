import java.util.*;

public class getstairspath {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> res = getStairPaths(n);
        System.out.println(res);
        scn.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        
        ArrayList<String> p1 = getStairPaths(n-1);
        ArrayList<String> p2 = getStairPaths(n-2);
        ArrayList<String> p3 = getStairPaths(n-3);

        ArrayList<String> paths = new ArrayList<>();

        for(String p : p1){
            paths.add( 1+p);
        }
        for(String p : p2){
            paths.add(2 + p);
        }
        for(String p : p3){
            paths.add(3+p);
        }
        return paths;
    }

}
