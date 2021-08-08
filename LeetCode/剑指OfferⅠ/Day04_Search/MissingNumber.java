package Day04_Search;

/**
 * 二分查找
 * 
 * @author lan
 * 2021年8月8日
 * TODO
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
