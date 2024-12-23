import java.util.*;

public class MaximumSumSubArrayKadanes {
    
    // Kadane's Algorithm 
    public int maxSubArray(int[] nums) {
        
        // Initialize maxSum and currentSum with the first element of the array
        int maxSum = nums[0];
        int currentSum = nums[0];

        // Iterate through the array starting from the second elements
        for (int i = 1; i < nums.length; i++) {
            // Update currentSum to either the current element alone or the current element plus currentSum
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update maxSum if currentSum is greater than maxSum
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum subarray sum found
        return maxSum;
    }

    // Main method 
    public static void main(String[] args) {
        MaximumSumSubArrayKadanes solution = new MaximumSumSubArrayKadanes();
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {-1, -1, -1, -1, -1};
        int[] nums3 = {1};
        int[] nums4 = {5,4,-1,7,8};

        System.out.println("Kadane's Maximum Subarray Sum : " + solution.maxSubArray(nums1)); // Output: 6
        System.out.println("Kadane's Maximum Subarray Sum : " + solution.maxSubArray(nums2)); // Output: -1
        System.out.println("Kadane's Maximum Subarray Sum : " + solution.maxSubArray(nums3)); // Output: 1
        System.out.println("Kadane's Maximum Subarray Sum : " + solution.maxSubArray(nums4)); // Output: 23
    }
}
