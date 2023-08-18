import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maximalNetworkRankTest1() {
        int n = 4;
        int[][] roads = {
                {0, 1},
                {0, 3},
                {1, 2},
                {1, 3}
        };
        int expected = 4;
        int actual = new Solution().maximalNetworkRank(n, roads);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maximalNetworkRankTest2() {
        int n = 4;
        int[][] roads = {
                {0, 1},
                {0, 3},
                {1, 2},
                {1, 3},
                {2, 3},
                {2, 4}
        };
        int expected = 5;
        int actual = new Solution().maximalNetworkRank(n, roads);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maximalNetworkRankTest3() {
        int n = 8;
        int[][] roads = {
                {0, 1},
                {1, 2},
                {2, 3},
                {2, 4},
                {5, 6},
                {5, 7}
        };
        int expected = 5;
        int actual = new Solution().maximalNetworkRank(n, roads);

        Assert.assertEquals(expected, actual);
    }
}
