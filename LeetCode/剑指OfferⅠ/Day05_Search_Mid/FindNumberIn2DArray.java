package Day05_Search_Mid;

public class FindNumberIn2DArray {
	public boolean findNumberIn2DArray(int target, int[][] matrix) {
		// 边界条件判断
		if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0)
			return false;
		// 获取函数矩阵的行数 m 与列数 n
		int m = matrix.length, n = matrix[0].length;
		// 初始化一开始的元素位置，这里我们设置为矩阵最右上角的元素
		int i = 0, j = n - 1;
		// 循环遍历整个函数
		while (i < m && j >= 0) {
			// 如果目标值小于右上角的数字，则列下标减一
			if (target < matrix[i][j])
				j--;
			// 如果目标值大于右上角的数字，则行下标加一
			else if (target > matrix[i][j])
				i++;
			// 如果相等，直接 true
			else
				return true;
		}
		// 循环结束后如果还没有找到目标时，返回 false
		return false;
	}
}
