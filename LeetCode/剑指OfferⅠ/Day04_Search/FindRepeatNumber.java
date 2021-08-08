package Day04_Search;

/**
 * 原地交换
 * 也可以直接哈希
 * @author lan
 * 2021年8月8日
 * TODO
 */
public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }
}
