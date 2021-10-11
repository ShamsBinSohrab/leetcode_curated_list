import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinimumInRotatedSortedArrayTest {

  private static final MinimumInRotatedSortedArray solution = new MinimumInRotatedSortedArray();

  @Test
  void test1() {
    var nums = new int[] {3, 4, 5, 1, 2};
    assertEquals(1, solution.findMin(nums));
  }

  @Test
  void test2() {
    var nums = new int[] {4, 5, 6, 7, 0, 1, 2};
    assertEquals(0, solution.findMin(nums));
  }

  @Test
  void test3() {
    var nums = new int[] {11, 13, 15, 17};
    assertEquals(11, solution.findMin(nums));
  }
}
