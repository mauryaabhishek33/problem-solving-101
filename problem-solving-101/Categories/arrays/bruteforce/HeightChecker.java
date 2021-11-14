/**
 * 
 */
package arrays.bruteforce;

/**
 * @author maury
 *
 */
public class HeightChecker {

	 public int heightChecker(int[] heights) {
	        int[] heightToFreq = new int[101];
	        
	        for (int height : heights) {
	            heightToFreq[height]++;
	        }
	        
	        int result = 0;
	        int curHeight = 0;
	        
	        for (int i = 0; i < heights.length; i++) {
	            while (heightToFreq[curHeight] == 0) {
	                curHeight++;
	            }
	            System.out.println(" currHeight = " + curHeight + " height[" + i + "] = " +heights[i]);
	            if (curHeight != heights[i]) {
	                result++;
	            }
	            System.out.println("result "+ result);
	            System.out.println("heightToFreq[" +curHeight+"]= " +heightToFreq[curHeight]);
	            heightToFreq[curHeight]--;
	            System.out.println("heightToFreq[" +curHeight+"]= " +heightToFreq[curHeight]);
	        }
	        
	        return result;
	    }
	public static void main(String[] args) {
		

	}

}
