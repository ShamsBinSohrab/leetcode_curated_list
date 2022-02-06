/** Problem: https://leetcode.com/problems/container-with-most-water */
public class ContainerWithMostWater {
  public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int maxArea = Integer.MIN_VALUE;
    while (left < right) {
      int h = Math.min(height[left], height[right]);
      int w = right - left;
      maxArea = Math.max(maxArea, h * w);
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return maxArea;
  }
}
