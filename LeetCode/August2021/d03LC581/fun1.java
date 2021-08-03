package d03LC581;

import java.util.Arrays;

/**
 * 排序 + 双指针
 * @author lan
 * 2021年8月3日
 * TODO
 */
public class fun1 {

    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;

        // 排序
        int[] arr = nums.clone();
        Arrays.sort(arr);

        // 两端遍历
        int i = 0, j = n - 1;
        while (i <= j && nums[i] == arr[i]) i++;
        while (i <= j && nums[j] == arr[j]) j--;
        return j - i + 1;
    }
}
