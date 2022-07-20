import java.util.HashMap;

class subarraysumk {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); // hashmap with key as sum(pre fix sum) and value as the frequency of that sum
        map.put(0, 1); // default prefix sum is 0 with 1 frequ of its own
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];  // adding each number to the sum
            if (map.containsKey(sum - k)) { // if the hashmap contains sum -  reqdsum, we add its frequency to the answer
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1); // if map doesnt contain sum - reqd sum, we insert value of sum as key and its freq by either 1 or 1++ if present before
        }
        return ans;

    }
}
