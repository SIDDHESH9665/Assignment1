function maxSubArrayBruteForce(nums) {
  let maxSum = nums[0]; // Initialize maxSum to the first element of array
  const n = nums.length;

  for (let i = 0; i < n; i++) {
    // Iterate over all possible subarrays
    let currentSum = 0;
    for (let j = i; j < n; j++) {
      currentSum += nums[j];

      maxSum = Math.max(maxSum, currentSum); // Update maxSum if currentSum is greater than maxSum
    }
  }

  return maxSum; // Return the maximum subarray sum 
}

const nums1 = [-2, 1, -3, 4, -1, 2, 1, -5, 4]; // Test cases
const nums2 = [-1,-1,-1,-1,-1];
const nums3 =  [1];

console.log(
  "Brute Force Maximum Subarray Sum (nums1): " + maxSubArrayBruteForce(nums1)
); // Output: 6
console.log(
  "Brute Force Maximum Subarray Sum (nums2): " + maxSubArrayBruteForce(nums2)
); // Output: -1
console.log(
    "Brute Force Maximum Subarray Sum (nums3): " + maxSubArrayBruteForce(nums3)
  ); // Output: 1