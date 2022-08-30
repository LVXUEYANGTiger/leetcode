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

class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] result = new Solution().twoSum(nums, target);
        System.out.println(toString(result));
    }

    private static String toString(int[] arr) {
        StringBuilder buf = new StringBuilder();
        buf.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != 0)
                buf.append(",");
            buf.append(arr[i]);
        }
        buf.append("]");
        return buf.toString();
    }

}
