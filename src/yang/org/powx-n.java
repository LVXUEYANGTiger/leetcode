package yang.org;

class Solution50 {
    public double myPow(double x, int n) {
        long N  = n;
        return N >= 0 ? quickMul(x,N) : 1.0 / quickMul(x,-N);
    }
    public double quickMul(double x,long N){
        double ans = 1.0;
        // 贡献初始值为x
        double xc = x;
        while(N  > 0){
            if(N % 2 == 1){
                ans *= xc;
            }
            xc *= xc;
            N /= 2;
        }
        return ans;
    }
}
// @solution-sync:end