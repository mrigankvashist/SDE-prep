import java.util.HashSet;
import java.util.Set;

class uniquemorsecode {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> decode = new HashSet<>();
        String[] morsecode = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.." };

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                int idx = c - 'a';
                sb.append(morsecode[idx]);
            }
            decode.add(sb.toString());
        }
        return decode.size();

    }
}