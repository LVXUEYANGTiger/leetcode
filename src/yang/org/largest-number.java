import java.util.PriorityQueue;

class Solution179 {
    public String largestNumber(int[] nums) {
        // 要根据拼接后的字符串的字典顺序来比较大小
        PriorityQueue<String> queue = new PriorityQueue<String>((x,y) -> (y + x).compareTo(x + y));

        for(int num : nums){
            queue.offer(String.valueOf(num));
        }
        String res = "";
        while (queue.size() > 0){
            res += queue.poll();
        }
        if(res.charAt(0) == '0'){
            return "0";
        }
        return res;

    }
}
// @solution-sync:end