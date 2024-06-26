package arrray;

public class MissingNumber {

	    public static int findMissingNumber(int[] nums) {
	        int n = nums.length;
	        int expectedSum = n * (n + 1) / 2;
	        
	        int actualSum = 0;
	        for (int num : nums) {
	            actualSum += num;
	        }
	        
	        return expectedSum - actualSum;
	    }

	    public static void main(String[] args) {
	        int[] nums1 = {3, 0, 1};
	        System.out.println("Missing number in nums1: " + findMissingNumber(nums1));  

	        int[] nums2 = {9, 6, 4,1,2, 3, 7, 0,8};
	        System.out.println("Missing number in nums2: " + findMissingNumber(nums2)); 
	    }
	}



