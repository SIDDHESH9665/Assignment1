Maximum Subarray Sum : 
This project provides two approaches to solve the Maximum Subarray Sum problem: the Brute Force approach and Kadane's Algorithm. Both implementations are in JavaScript and include explanatory comments, test cases, and an analysis of the time and space complexity.

Brute Force Approach : 
The Brute Force approach iterates over all possible subarrays and calculates their sums, keeping track of the maximum sum encountered.

Time and Space Complexity : 

Time Complexity: 𝑂(𝑛^2)
 – We evaluate all possible subarrays by iterating through the array with two nested loops.
Space Complexity: 𝑂(1)
 – Only a few extra variables are used, regardless of the input size.


Kadane's Algorithm :
Kadane's Algorithm is a more efficient way to find the maximum subarray sum using a dynamic programming approach. It maintains a currentSum variable to track the sum of the current subarray and updates the currentSum and maxSum variables as it iterates through the array.

Time and Space Complexity : 
Time Complexity: 𝑂(𝑛)
 – We traverse the array only once, updating the sums in linear time.
Space Complexity: 𝑂(1)
 – Only a few extra variables are used.
