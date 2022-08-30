import java.util.Stack;

// @solution-sync:begin
class Solution {
    Stack<Integer> stack = new Stack<Integer>();
    public int evalRPN(String[] tokens) {
        // 添加进去
        Integer result = 0;
        for(int i = 0;i < tokens.length;i++){
            if(isNumber(tokens[i])){   
                stack.push(Integer.valueOf(tokens[i]));
            } else {
                int first = Integer.valueOf(stack.pop());
                int second = Integer.valueOf(stack.pop());
                if(tokens[i].equals("+")){
                    result = first + second;
                } else if(tokens[i].equals("-")){
                    result = second - first;
                } else if(tokens[i].equals("*")){
                    result = second * first;
                } else{
                    result = second / first;
                }
                stack.push(result);
            }
            
        }
        return stack.peek();
    }

    public boolean isNumber(String token) {
        return !("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token));
    }
}
// @solution-sync:end

class Main {

    public static void main(String[] args) {
        String[] tokens = new String[]{"2", "1", "+", "3", "*"};

        int result = new Solution().evalRPN(tokens);
        System.out.println(result);
    }

}
