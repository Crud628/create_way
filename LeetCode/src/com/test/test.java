package com.test;

import java.util.Arrays;
import java.util.Date;


/**
 * 算法测试
 * @author lan
 * 2021年7月4日
 * TODO
 */
public class test {


	public static void main(String[] args) {
		int[] nums = {1391,5916};
		int[][] nums2 = {{2,1},{3,4},{3,2}};
		long start = new Date().getTime();
		
		System.out.println(new test().minStoneSum(nums, 3));

		System.out.println("执行时间：" + (new Date().getTime() - start));
	}
	
    public int minStoneSum(int[] piles, int k) {
    	int n = piles.length;
    	int sum = Arrays.stream(piles).sum();
    	Arrays.sort(piles);
    	for (int i = n-1; ;i--,k--) {
    		if (sum <= 1 || k == 0) return sum;
    		i = (i + n) % n;
    		int temp = piles[i] / 2;
    		piles[i] -= temp;
    		sum -= temp;
    	}
    }
	

}
