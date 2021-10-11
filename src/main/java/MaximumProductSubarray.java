/** Problem: https://leetcode.com/problems/maximum-product-subarray/ */
public class MaximumProductSubarray {

  public int maxProduct(int[] nums) {
    int max = nums[0], maxNeg = nums[0], maxPos = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == 0) {
        maxNeg = 0;
        maxPos = 0;
        continue;
      }

      if (nums[i] > 0) {
        maxNeg = Math.min(nums[i], maxNeg * nums[i]);
        maxPos = Math.max(nums[i], maxPos * nums[i]);
      } else {
        int nextMaxPos = Math.max(nums[i], maxNeg * nums[i]);
        maxNeg = Math.min(nums[i], maxPos * nums[i]);
        maxPos = nextMaxPos;
      }
      max = Math.max(max, maxPos);
    }
    return max;
  }
}
