/**
 * 
 */
package algortihms.bfsOrdfs;

/**
 * @author maury
 *
 */
public class MaxAreaOfIsland {

	public static int maxAreaOfIsland(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int area = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				area = Math.max(area, floodFill(grid, i, j));
			}
		}
		return area;
	}

	/**
	 * @param grid
	 * @param i
	 * @param j
	 * @param k
	 * @return
	 */
	private static int floodFill(int[][] grid, int i, int j) {
		if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1
				|| grid[i][j] != 1)
			return 0;
		grid[i][j] = 0;
		return 1 + floodFill(grid, i + 1, j) + floodFill(grid, i - 1, j)
				+ floodFill(grid, i, j + 1) + floodFill(grid, i, j - 1);
	}

	public static void main(String[] args) {
		int grid[][] = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
				{0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
				{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
		System.out.println(maxAreaOfIsland(grid));
	}
}
