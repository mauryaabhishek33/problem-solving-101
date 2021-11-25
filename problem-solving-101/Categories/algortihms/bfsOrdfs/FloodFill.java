/**
 * 
 */
package algortihms.bfsOrdfs;

/**
 * @author maury
 *
 */
public class FloodFill {

	public static int[][] floodFill(int[][] image, int sr, int sc,
			int newColor) {
		if (image[sr][sc] == newColor)
			return image;
		dfs(image, sr, sc, newColor, image[sr][sc]);
		return image;
	}

	public static void dfs(int[][] image, int sr, int sc, int newColor,
			int startColor) {
		if ((sr < 0 || sr > image.length - 1 || sc < 0
				|| sc > image[0].length - 1)) {
			return;
		}
		if (image[sr][sc] == startColor) {
			image[sr][sc] = newColor;
		} else {
			return;
		}
		dfs(image, sr - 1, sc, newColor, startColor);
		dfs(image, sr + 1, sc, newColor, startColor);
		dfs(image, sr, sc - 1, newColor, startColor);
		dfs(image, sr, sc + 1, newColor, startColor);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int image[][] = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		System.out.println(floodFill(image, 1, 1, 2));

	}

}
