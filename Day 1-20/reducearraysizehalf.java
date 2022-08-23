import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class reducearraysizehalf {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        List<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq,Collections.reverseOrder());
        int i = 0;
        int cnt = 0;
        int totalel = n;
        while(totalel>n/2){
            totalel = totalel - freq.get(i);
            i++;
            cnt++;
        }
        return cnt;
    }
}
