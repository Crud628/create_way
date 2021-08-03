package d03LC581;

/**
 * 双指针 + 线性扫描
 * 
 * @author lan
 * 2021年8月3日
 * TODO
 */
public class fun2 {
	// 哨兵
	int MIN = -100005, MAX = 100005;
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        // 分区间，定出两个单调递增的分割点
        int i = 0, j = n - 1;
        while (i < j && nums[i] <= nums[i + 1]) i++;
        while (i < j && nums[j] >= nums[j - 1]) j--;

        // 调整两个分割点位置，确定中间乱序具体位置
        int l = i, r = j;
        int min = nums[i], max = nums[j];
        for (int u = l; u <= r; u++) {
            if (nums[u] < min) {
                while (i >= 0 && nums[i] > nums[u]) i--;
                min = i >= 0 ? nums[i] : MIN;
            }
            if (nums[u] > max) {
                while (j < n && nums[j] < nums[u]) j++;
                max = j < n ? nums[j] : MAX;
            }
        }
        return j == i ? 0 : (j - 1) - (i + 1) + 1;
    }
}
