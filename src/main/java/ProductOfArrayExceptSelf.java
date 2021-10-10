/** Problem: https://leetcode.com/problems/product-of-array-except-self/ */
public class ProductOfArrayExceptSelf {

  /*public int[] productExceptSelf(int[] nums) {
    var left_array = new int[nums.length];
    var right_array = new int[nums.length];
    var result = new int[nums.length];
    left_array[0] = 1;
    right_array[nums.length - 1] = 1;
    for (int i = 1; i < nums.length; i++) {
      left_array[i] = left_array[i - 1] * nums[i - 1];
    }
    for (int i = nums.length - 1; i > 0; i--) {
      right_array[i - 1] = right_array[i] * nums[i];
    }
    for (int i = 0; i < left_array.length; i++) {
      result[i] = left_array[i] * right_array[i];
    }
    return result;
  }*/

  public int[] productExceptSelf(int[] nums) {
    var result = new int[nums.length];
    var pre = 1;
    var post = 1;

    result[0] = pre;
    for (int i = 1; i < nums.length; i++) {
      pre *= nums[i - 1];
      result[i] = pre;
    }

    result[nums.length - 1] *= post;
    for (int i = nums.length - 1; i > 0; i--) {
      post *= nums[i];
      result[i - 1] *= post;
    }
    return result;
  }
}
