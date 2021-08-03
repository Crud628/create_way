package LC0107;

public class fun2 {
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
	 * 原地旋转
	 * 
	 * @param matrix
	 */
	public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < (n + 1) / 2; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
	}
}
