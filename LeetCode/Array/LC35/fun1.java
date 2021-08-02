package LC35;

public class fun1 {
	public static void main(String[] args) {
		
	}
	
    public int searchInsert(int[] nums, int target) {
    	 int n = nums.length;
         int left = 0, right = n - 1, ans = n;
         while (left <= right) {
             int mid = ((right - left) >> 1) + left;
             if (target <= nums[mid]) {
                 ans = mid;
                 right = mid - 1;
             } else {
                 left = mid + 1;
             }
         }
         return ans;
    }
}
