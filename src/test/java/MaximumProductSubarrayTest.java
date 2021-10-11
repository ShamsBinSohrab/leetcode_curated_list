import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumProductSubarrayTest {

  private static final MaximumProductSubarray solution = new MaximumProductSubarray();

  @Test
  void test1() {
    var nums = new int[] {2, 3, -2, 4};
    assertEquals(6, solution.maxProduct(nums));
  }

  @Test
  void test2() {
    var nums = new int[] {-2, 0, -1};
    assertEquals(0, solution.maxProduct(nums));
  }
}
