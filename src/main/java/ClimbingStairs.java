/** Problem: https://leetcode.com/problems/climbing-stairs/ */
public class ClimbingStairs {
  public int climbStairs(int n) {
    if (n > 2) {
      int[] array = new int[n + 1];
      array[0] = 1;
      array[1] = 1;
      for (int i = 2; i <= n; i++) {
        array[i] = array[i - 1] + array[i - 2];
      }
      return array[n];
    }
    return n;
  }
}
