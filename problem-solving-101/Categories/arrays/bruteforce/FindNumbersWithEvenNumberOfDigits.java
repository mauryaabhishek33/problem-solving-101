/**
 * 
 */
package arrays.bruteforce;

/**
 * @author maury
 *
 */
public class FindNumbersWithEvenNumberOfDigits {
			
public int findNumbers(int[] nums) {
        
        int even_number_of_digits_count=0,numberOfdigits=0;
        for(int i : nums)
        {
            numberOfdigits=calculateNumberOfDigits(i);
            if(numberOfdigits%2==0)
                even_number_of_digits_count++;
        }
        return even_number_of_digits_count;
    }
    
    public int calculateNumberOfDigits(int number)
    {
        int total=0,d=0;
        
        while(number!=0)
        {
            d=number%10;
            total++;
            number=number/10;
        }
        return total;
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
