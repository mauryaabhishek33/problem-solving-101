/**
 * 
 */
package arrays;

/**
 * @author maury
 *
 */
public class ReplaceElementsWithGreatestElementOnRightSide {

	/**
	 * @param args
	 * trivial approach running time O(n2) 
	 * 
	 */
	public int[] replaceElements(int[] arr) {
        int N =arr.length,max;
        if(arr.length==1)
        {
            arr[0]=-1;
            return arr;
        }
        for(int i=0;i<N;i++)
        {   
            if(i==N-1){
                arr[N-1]=-1;
                break;
            }
            max =arr[i+1];
            for(int j =i+1; j<N;j++){
                if(arr[j]>max)
                    max=arr[j];
            }
         
         arr[i]=max;
        }
        return arr;
    }
	/**
	 * optimal solution by myself running time O(n)
	 * 
	 * same solution with recursion given which 0ms 100% 
	 * class Solution {
    public int[] replaceElements(int[] arr) {
        int N = arr.length-1,current_value=0;
        int max = arr[N];
        arr[N]=-1;
        if(N==1)
        {
            return arr;
        }
        
        for(int i=N-1;i>=0;i--)
        {
            current_value=arr[i];
            arr[i]=max;
            
            if(current_value > max)
                max=current_value;
        }
        return arr;
    }
}
	 * @param args
	 *  LEETCODE optimized solution 
	 *  public int[] replaceElements(int[] arg) {
        popMaxRight(arg , arg.length-1, -1);
       return arg;
    }
    
    private static void popMaxRight(int[] args, int i, int max) {
		if(i<0) return;
		int temp = args[i];
		args[i] = max;
		if(temp>max) {
			max = temp;
		}
		popMaxRight(args, i-1, max);
	}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
