import java.util.*;

public class getmazepath {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> res = getMazePaths(0,0,n-1,m-1);
        System.out.println(res);
        scn.close();

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> bp = new ArrayList<>();
        ArrayList<String> rp = new ArrayList<>();



        if(sr<dr){
            bp = getMazePaths(sr+1,sc,dr,dc);
        }
        if(sc<dc){
            rp = getMazePaths(sr,sc+1,dr,dc);
        }
        

        ArrayList<String> paths = new ArrayList<>();
        for(String p : rp){
            paths.add("h" + p);
        }
        for(String p : bp){
            paths.add("v" + p);
        }
        return paths;


    }

}