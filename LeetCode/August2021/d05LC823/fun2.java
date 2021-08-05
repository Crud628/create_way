package d05LC823;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 根据题意，若一个节点没有出边，则该节点是安全的；若一个节点出边相连的点都是安全的，则该节点也是安全的。
 * 根据这一性质，我们可以将图中所有边反向，得到一个反图，然后在反图上运行拓扑排序。
 * 具体来说，首先得到反图 \textit{rg}rg 及其入度数组 \textit{inDeg}inDeg。
 * 将所有入度为 0 的点加入队列，然后不断取出队首元素，将其出边相连的点的入度减一，
 * 若该点入度减一后为 0，则将该点加入队列，如此循环直至队列为空。循环结束后，
 * 所有入度为 0 的节点均为安全的。我们遍历入度数组，并将入度为 00 的点加入答案列表。
 * 
 * @author lan
 * 2021年8月5日
 * TODO
 */
public class fun2 {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> rg = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; ++i) {
            rg.add(new ArrayList<Integer>());
        }
        int[] inDeg = new int[n];
        for (int x = 0; x < n; ++x) {
            for (int y : graph[x]) {
                rg.get(y).add(x);
            }
            inDeg[x] = graph[x].length;
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < n; ++i) {
            if (inDeg[i] == 0) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            int y = queue.poll();
            for (int x : rg.get(y)) {
                if (--inDeg[x] == 0) {
                    queue.offer(x);
                }
            }
        }

        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; ++i) {
            if (inDeg[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
    }

}
