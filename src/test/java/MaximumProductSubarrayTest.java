import junit.framework.TestCase;

public class MaximumProductSubarrayTest extends TestCase {

  private static final MaximumProductSubarray solution = new MaximumProductSubarray();

  public void test1() {
    var nums = new int[] {2, 3, -2, 4};
    assertEquals(6, solution.maxProduct(nums));
  }

  public void test2() {
    var nums = new int[] {-2, 0, -1};
    assertEquals(0, solution.maxProduct(nums));
  }
}
