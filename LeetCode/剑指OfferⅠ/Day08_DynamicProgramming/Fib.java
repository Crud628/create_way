package Day08_DynamicProgramming;

/**
 * 斐波那契
 * 
 * @author lan
 * 2021年8月12日
 * TODO
 */
public class Fib {
    public int fib(int n) {
        int a = 0, b = 1, sum;
        int mod = 1000000007;
        for(int i = 0; i < n; i++){
            sum = (a + b) % mod;
            // 移动位置
            a = b;
            b = sum;
        }
        return a;
    }
}
