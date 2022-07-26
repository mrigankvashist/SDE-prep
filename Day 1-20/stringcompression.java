import java.util.*;

public class stringcompression {

    public static String compression1(String str) {
        String s = str.substring(0, 1);
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr != prev) {
                s += curr;
            }
        }
        return s;
    }

    public static String compression2(String str) {
        String s = str.substring(0, 1);
        int cnt = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr == prev) {
                cnt++;
            } else {
                if (cnt > 1) {
                    s += cnt;
                    cnt = 1;
                }
                s += curr;
            }
        }
        if (cnt > 1) {
            s += cnt;
        }
        return s;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
        scn.close();
    }

}
