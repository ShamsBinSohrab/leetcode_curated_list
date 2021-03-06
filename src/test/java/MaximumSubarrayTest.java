import junit.framework.TestCase;

public class MaximumSubarrayTest extends TestCase {

  private static final MaximumSubarray solution = new MaximumSubarray();

  public void test1() {
    var nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
    assertEquals(6, solution.maxSubArray(nums));
  }

  public void test2() {
    var nums = new int[]{1};
    assertEquals(1, solution.maxSubArray(nums));
  }

  public void test3() {
    var nums = new int[]{5, 4, -1, 7, 8};
    assertEquals(23, solution.maxSubArray(nums));
  }
}
