package LC0107;

public class fun1 {
	public static void main(String[] args) {
		int[][] nums = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		new fun1().rotate(nums);
		for (int[] num : nums) {
			for (int i : num) {
				System.out.println(i + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 暴力解法
	 * 
	 * 申请额外空间
	 * 
	 * @param matrix
	 */
	public void rotate(int[][] matrix) {
    	int n = matrix.length;
        int[][] matrix_new = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix_new[j][n - i - 1] = matrix[i][j];
            }
        }
        // 数组复制
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = matrix_new[i][j];
            }
        }
    }
}
