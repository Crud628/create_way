package Day08_DynamicProgramming;

public class NumWays {
    public int numWays(int n) {
        int a = 1, b = 1, sum;
        int mod = 1000000007;
        for(int i = 0; i < n; i++){
            sum = (a + b) % mod;
            a = b;
            b = sum;
        }
        return a;
    }
}
