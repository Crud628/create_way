package d08LC1137;

import java.util.HashMap;

/**
 * 经典递归 可以用hash存储减少计算次数
 * 
 * @author lan
 * 2021年8月8日
 * TODO
 */
public class fun1 {
	HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>(); 
    public int tribonacci(int n) {
    	hash.put(0, 0);
    	hash.put(1, 1);
    	hash.put(2, 1);
    	if (hash.get(n) != null) return hash.get(n);
    	return t(n-1)+t(n-2)+t(n-3);
    }
    public int t(int n) {
    	if (hash.get(n) == null) {
    		hash.put(n, t(n-1)+t(n-2)+t(n-3));
    		return hash.get(n);
    	}
    	return hash.get(n);
    }
    
    public static void main(String[] args) {
		System.out.println(new fun1().tribonacci(8));
	}
}
