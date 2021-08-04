package d04LC611;

import java.util.Arrays;

public class fun1 {

	/**
	 * 排序加二分查找
	 * 
	 * 时间：O(n^2log n)
	 * 空间：O(log n)
	 * 
	 * @param nums
	 * @return
	 */
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        // 排序
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int left = j + 1, right = n - 1, k = j;
                // 二分查找
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (nums[mid] < nums[i] + nums[j]) {
                        k = mid;
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                ans += k - j;
            }
        }
        return ans;
    }
	
}
