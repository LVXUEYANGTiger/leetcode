import java.util.HashMap;
import java.util.Map;
import java.lang.StringBuilder;

// @solution-sync:begin
class Solution {
    public int[] twoSum(int[] nums, int target) {
       // 哈希表
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target - nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
// @solution-sync:end
