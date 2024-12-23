public class MaximumSubarrayBruteForce {

    // Brute Force Solution
    public int maxSubArrayBruteForce(int[] nums) {
        
        // Initialize maxSum to the first element of the array
        int maxSum = nums[0];
        int n = nums.length;

        // Iterate over all possible subarrays
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                // Update maxSum if currentSum is greater than maxSum
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        // Return the maximum subarray sum found
        return maxSum;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        MaximumSubarrayBruteForce solution = new MaximumSubarrayBruteForce();
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {-1, -1, -1, -1, -1};
        int[] nums3 = {1};
        int[] nums4 = {5,4,-1,7,8};

        System.out.println("Brute Force Maximum Subarray Sum : " + solution.maxSubArrayBruteForce(nums1)); // Output: 6
        System.out.println("Brute Force Maximum Subarray Sum : " + solution.maxSubArrayBruteForce(nums2)); // Output: -1
        System.out.println("Brute Force Maximum Subarray Sum : " + solution.maxSubArrayBruteForce(nums3)); // Output: 1
        System.out.println("Brute Force Maximum Subarray Sum : " + solution.maxSubArrayBruteForce(nums4)); // Output: 23
    }
}
