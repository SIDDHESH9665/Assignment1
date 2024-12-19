function maxSubArray(nums) {
  let maxSum = nums[0]; // Initialize maxSum and currentSum with the first element of the array
  let currentSum = nums[0];

  for (let i = 1; i < nums.length; i++) {
    // Iterate through the array starting from the second element

    currentSum = Math.max(nums[i], currentSum + nums[i]); // Update currentSum to the maximum of the current element or current element + currentSum

    maxSum = Math.max(maxSum, currentSum); // Update maxSum if currentSum is greater than maxSum
  }

  return maxSum; // Return the maximum subarray sum found
}

// Test cases
const nums1 = [-2, 1, -3, 4, -1, 2, 1, -5, 4]; // Test cases
const nums2 = [-1,-1,-1,-1,-1];
const nums3 = [1];

console.log(
  "Brute Force Maximum Subarray Sum (nums1): " + maxSubArrayBruteForce(nums1)
); // Output: 6
console.log(
  "Brute Force Maximum Subarray Sum (nums2): " + maxSubArrayBruteForce(nums2)
); // Output: -1
console.log(
    "Brute Force Maximum Subarray Sum (nums3): " + maxSubArrayBruteForce(nums3)
  ); // Output: 1
