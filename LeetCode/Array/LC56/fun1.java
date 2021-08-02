package LC56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class fun1 {
	public static void main(String[] args) {
		int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
		int[][] result = new fun1().merge(nums);
		System.out.println(result);
	}
	
    public int[][] merge(int[][] intervals) {
    	// 特判
        if (intervals.length == 0) {
            return new int[0][2];
        }
        
        // 排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
        
        // 合并
        List<int[]> merged = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; ++i) {
            int L = intervals[i][0];// 头
            int R = intervals[i][1];// 尾
            
            // 对比并插入
            if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < L) {
                merged.add(new int[]{L, R});
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], R);
            }
        }
        
        // 转换
        return merged.toArray(new int[merged.size()][]);
    }
}
