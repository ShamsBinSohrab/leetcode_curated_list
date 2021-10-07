import java.util.HashMap;

/** Problem: https://leetcode.com/problems/two-sum/ */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    var map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      var compliment = target - nums[i];
      if (map.containsKey(compliment)) {
        return new int[] {map.get(compliment), i};
      }
      map.put(nums[i], i);
    }
    return new int[] {};
  }
}
