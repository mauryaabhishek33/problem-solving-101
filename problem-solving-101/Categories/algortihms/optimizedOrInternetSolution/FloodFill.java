/**
 * 
 */
package algortihms.optimizedOrInternetSolution;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author maury
 *
 */
public class FloodFill {

	public static int[][] floodFill(int[][] image, int sr, int sc,
			int newColor) {
		int color = image[sr][sc];
		if (color == newColor) {
			return image;
		}

		int m = image.length;
		int n = image[0].length;

		Queue<Integer> q = new LinkedList<>();
		q.add(sr * n + sc);
		image[sr][sc] = newColor;

		while (!q.isEmpty()) {
			int cur = q.remove();
			int i = cur / n;
			int j = cur % n;
			image[i][j] = newColor;

			if (i + 1 < m && image[i + 1][j] == color) {
				q.add(cur + n);
			}
			if (i >= 1 && image[i - 1][j] == color) {
				q.add(cur - n);
			}
			if (j + 1 < n && image[i][j + 1] == color) {
				q.add(cur + 1);
			}
			if (j >= 1 && image[i][j - 1] == color) {
				q.add(cur - 1);
			}
		}

		return image;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int image[][] = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		System.out.println(floodFill(image, 1, 1, 2));

	}

}
