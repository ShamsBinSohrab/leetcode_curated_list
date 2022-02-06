/** Problem: https://leetcode.com/problems/maximum-subarray/ */
public class MaximumSubarray {
  public int maxSubArray(int[] nums) {
    var tMx = nums[0];
    var gMx = nums[0];
    for (int i = 1; i < nums.length; i++) {
      tMx = Math.max(nums[i], tMx + nums[i]);
      gMx = Math.max(tMx, gMx);
    }
    return gMx;
  }
}
