import java.util.ArrayList;
import java.util.List;


public class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (int[] road : roads) {
            int out = road[0];
            int in = road[1];
            adjacencyList.get(out).add(in);
            adjacencyList.get(in).add(out);
        }
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int currentNodeNeighboursCount = adjacencyList.get(i).size();
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int neighborsCountOfSecondNode = adjacencyList.get(j).size();
                    int rank = currentNodeNeighboursCount + neighborsCountOfSecondNode;
                    if (adjacencyList.get(i).contains(j)) {
                        rank--;
                    }
                    maxCount = Math.max(maxCount, rank);
                }
            }
        }

        return maxCount;
    }
}
