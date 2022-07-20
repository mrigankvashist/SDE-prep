import java.util.Arrays;
import java.util.HashMap;

class numofsubmatricessumtarget {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;
        int[] sumarray = new int[n];  // subarray sum ranging over columns
        for (int i = 0; i < m; i++) { // 2 loop for rows, starting row and ending row to cover all rows in between for all possibke combinations of submatrices
            Arrays.fill(sumarray, 0); // initialising sumarray as 0
            for (int j = i; j < m; j++) { // ending row
                for (int k = 0; k < n; k++) { // col loop
                    sumarray[k] += matrix[j][k]; // adding each matrix element to sumarray' array
                }
                ans += subarraysum(sumarray, target); // passing each sum array to sub array sum k fn along with target
            }
        }
        return ans;

    }


    //SAME FN OF subarray sum k
    private int subarraysum(int[] n, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
            if (map.containsKey(sum - t)) {
                ans += map.get(sum - t);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}