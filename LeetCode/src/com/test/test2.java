package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2{

	public static void main(String[] args) {
		// 模数
		int mod = 555555555;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();
		int q = sc.nextInt();
		int t = sc.nextInt();
		
		// 求出t的组合方式
		int[][] factors = factor(t);
		
		// 遍历计算结果
		int count = factors.length;
		long sum = 0;
		for (int i = 0;i < count;i++) {
			int j = (n - p - factors[i][0]) / 2;
			int k = (m - q - factors[i][1]) / 2;
			sum += nchoosek(n, p-2*j) * nchoosek(m, q-2*k);
			sum %= mod;
		}
		
		// 输出
		System.out.println(sum % mod);
	}

	/**
	 * 求出所有因素的组合
	 * 
	 * @param t 
	 * @return 因素的组合的二维数组
	 */
	private static int[][] factor(int t) {
		if (t == 1) {
			int[][] result = new int[1][2];
			result[0][0] = 1;
			result[0][1] = 1;
			return result;
		}
		
		// TODO Auto-generated method stub
		List<Integer[]> list = new ArrayList<Integer[]>();
		double sqrt = Math.sqrt(t);
		for (int i = 1; i < sqrt;i++) {
			if (t % i == 0) {
				Integer[] nums = {i,t/i};
				Integer[] nums2 = {t/i,i};
				list.add(nums);
				list.add(nums2);
			}
		}
		
		// list转换为二维数组
		int size = list.size();
		int[][] result = new int[size][2];
		for (int i =0;i<size;i++) {
			result[i][0] = list.get(i)[0];
			result[i][1] = list.get(i)[1];
		}
		return result;
	}
	
	/**
	 *  计算组合
	 *  
	 * @param n 下面的数
	 * @param k 上面的数
	 * @return 有多少结果
	 */
	public static int nchoosek(int n, int k){
	    k = (k > (n - k)) ? n - k : k;  // C(n, k) = C(n, n - k)
	    if(k == 1){  // C(n, 0) = 1, C(n, 1) = n
	        return n;
	    }
	    if (k == 0) {
	    	return 1;
	    }
	    int divisor = n - k + 1;
	    int dividend = 1;
	    double cnk = 1.0;
	    for(int i = 0; i < k; i++){
	        cnk *= (double) (divisor + i) / (dividend + i);
	    }
	    return (int) cnk;
	}
}
