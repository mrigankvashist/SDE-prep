import java.util.*;

public class getmazepathjump {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> res = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(res);
        scn.close();

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();
        for (int sh = 1; sh <= dc - sc; sh++) {
            ArrayList<String> hp = getMazePaths(sr, sc + sh, dr, dc);
            for (String x : hp) {
                paths.add("h" + sh + x);
            }
        }

        for (int sv = 1; sv <= dr - sr; sv++) {
            ArrayList<String> vp = getMazePaths(sr + sv, sc, dr, dc);
            for (String x : vp) {
                paths.add("v" + sv + x);
            }
        }

        for (int sd = 1; sd <= dr - sr && sd <= dc - sc; sd++) {
            ArrayList<String> dp = getMazePaths(sr + sd, sc + sd, dr, dc);
            for (String x : dp) {
                paths.add("d" + sd + x);
            }
        }
        return paths;
    }

}
