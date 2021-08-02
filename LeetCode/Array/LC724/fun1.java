package LC724;

import java.util.Arrays;

public class fun1 {
	public static void main(String[] args) {
		int[] nums = {1, 7, 3, 6, 5, 6};
		int pivotIndex = new fun1().pivotIndex(nums);
		System.out.println(pivotIndex);
	}
	
	public int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (temp * 2 + nums[i] == sum) return i;
            temp += nums[i];
        }
        return -1;
    }
}
