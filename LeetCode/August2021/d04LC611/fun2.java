package d04LC611;

import java.util.Arrays;

public class fun2 {

	
	/**
	 * 
	 * 排序 + 双指针
	 * 
	 * 时间：O(n^2)
	 * 空间：O(log n)
	 * 
	 * @param nums
	 * @return
	 */
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int k = i;
            for (int j = i + 1; j < n; ++j) {
                while (k + 1 < n && nums[k + 1] < nums[i] + nums[j]) {
                    ++k;
                }
                ans += Math.max(k - j, 0);
            }
        }
        return ans;
    }

}
