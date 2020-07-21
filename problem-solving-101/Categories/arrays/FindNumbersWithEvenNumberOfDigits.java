/**
 * 
 */
package arrays;

/**
 * @author maury
 *
 */
public class FindNumbersWithEvenNumberOfDigits {
			
public int findNumbers(int[] nums) {
	int count=0;
    
    // calc digits of numbers
    // 1~9 : 1 bit
    // 10~99: 2 bits (V)
    // 100~999: 3 bits        
    // 1000~9999: 4 bits (V)      
    // 10000~99999: 5 bits
    // 100000: 6 bits (V)
    
    
    for(int i=0; i<nums.length; i++){
        if(nums[i]/100 == 0 && nums[i]/10 > 0){
            count++;
        }
        else if(nums[i]/10000 == 0 && nums[i]/1000 > 0){
            count++;
        }            
        else if(nums[i]==100000){
            count++;
        }
    }
        return count;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNumbersWithEvenNumberOfDigits find = new FindNumbersWithEvenNumberOfDigits();
		
		int nums[]= {12,345,2,6,7896, 555,901,482,1771};
		
		System.out.println(find.findNumbers(nums));
		
	}

}
