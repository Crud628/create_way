package LC0107;

public class fun3 {
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
	 * 两次翻转，代替旋转
	 * 
	 * @param matrix
	 */
	 public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 水平翻转
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < n; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = temp;
            }
        }
        // 主对角线翻转
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
