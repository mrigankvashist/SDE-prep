import java.util.HashMap;

class combinationsumIV {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int combinationSum4(int[] nums, int target) {
        return combinationSum4helper(nums, target);
    }

    public int combinationSum4helper(int[] nums, int target) {
        if (map.containsKey(target)) {
            return map.get(target);
        }

        if (target == 0) {
            return 1;
        }
        if (target < 0) {
            return 0;
        } else {
            int comb = 0;
            for (int e : nums) {
                comb += combinationSum4helper(nums, target - e);
            }
            map.put(target, comb);
            return comb;
        }
    }
}