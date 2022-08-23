import java.util.*;

public class getkpc {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        ArrayList<String> ans = getKPC(s);
        System.out.println(ans);
        scn.close();
    }

    static String[] codes = new String[] { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ss = str.substring(1);
        ArrayList<String> res = getKPC(ss);
        ArrayList<String> mres = new ArrayList<>();

        String reqdw = codes[ch - '0'];
        for (int i = 0; i < reqdw.length(); i++) {
            char reqdwchar = reqdw.charAt(i);
            for (String x : res) {
                mres.add(reqdwchar + x);
            }
        }
        return mres;

    }

}
