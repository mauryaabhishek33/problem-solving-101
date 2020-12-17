/**
 * 
 */
package lenskart_prep;

/**
 * @author maury
 *
 */
public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static int removeDuplicates(int arr []) {
		int j=1; int unique=arr[0];
		for(int i =1; i<arr.length; i++) {
			if(arr[i]!=unique) {
				arr[j]=arr[i];
				unique=arr[i];
				j++;
			}
		}
		
		return j;
		
	}
	
	public static void main(String[] args) {
		
		int arr [] = {1,1,1,2,2,3,3,3,4,4,5,5};
		int size = removeDuplicates(arr);
		
		for(int i = 0 ; i<size ; i++) {
			System.out.println(arr[i]);
		}
	}

}
