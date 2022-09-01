package yang.org;

class Solution400 {
    public int findNthDigit(int n) {
        if(n <= 9){
            return n;
        }
       // 1.求出这个数是几位数
        int index = 1;
        long sum = 0;
        for (;index <= 9;index++) {
            long count =  (long) index * ((long) Math.pow(10, index) - (long) Math.pow(10, index - 1));
            if(count + sum >= n){
                break;
            }
            sum += count;
        }
       // 2.找出这个数
        long minNum = (long) Math.pow(10,index - 1);
        long add = (n - sum - 1) / index;
        long target = minNum + add;
       // 3.求模
        int mod = (int) ((n - sum - 1) % index);

        return String.valueOf(target).charAt(mod) - '0';

    }
}
// @solution-sync:end
