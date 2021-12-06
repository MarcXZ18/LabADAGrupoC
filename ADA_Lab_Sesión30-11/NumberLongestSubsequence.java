
public class NumberLongestSubsequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {10,9,2,5,3,7,101,18};
		int [] nums2 = {7,7,7,7,7,7,7};
		int [] nums3 = {0,1,0,3,2,3};
				
		System.out.println(lengthOfLIS(nums));
		System.out.println(lengthOfLIS(nums2));
		System.out.println(lengthOfLIS(nums3));
	}
	// Metodo dado un array de numeros calculara la subcadena
	// creciente mas larga de este array
    	public static int lengthOfLIS(int[] nums) {
        	if (nums.length == 0)
        		return 0;  
        
        	int [] nArray = new int[nums.length];       
		for (int i = 0; i < nums.length; i++) {
			nArray[i] = 1;
		}
		int max = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j])
					nArray[i] = Math.max(nArray[i], nArray[j] + 1);                
			}
			max = Math.max(nArray[i], max);
		}        
		return max;    
	}
}
