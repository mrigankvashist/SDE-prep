//import java.util.Arrays;

class validanagram {
    // brute force
    // public boolean isAnagram(String s, String t) {
    // char[] a = s.toCharArray();
    // char[] b = t.toCharArray();

    // Arrays.sort(a);
    // Arrays.sort(b);

    // boolean ans = Arrays.equals(a,b);
    // return ans;

    // }

    public boolean isAnagram(String s, String t) {
        int[] freqS = getFreqMap(s);
        int[] freqT = getFreqMap(t);

        for (int i = 0; i < 26; i++) {
            if (freqS[i] != freqT[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] getFreqMap(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }
}
