import junit.framework.TestCase;

public class MinimumInRotatedSortedArrayTest extends TestCase {

  private static final MinimumInRotatedSortedArray solution = new MinimumInRotatedSortedArray();

  public void test1() {
    int[] nums = new int[] {1, 2};
    assertEquals(1, solution.findMin(nums));
  }

  public void test2() {
    int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
    assertEquals(1, solution.findMin(nums));
  }

  public void test3() {
    int[] nums = new int[] {4, 5, 6, 7, 0, 1, 2};
    assertEquals(0, solution.findMin(nums));
  }

  public void test4() {
    int[] nums = new int[] {3, 1, 2};
    assertEquals(1, solution.findMin(nums));
  }

  public void test5() {
    int[] nums = new int[] {2, 3, 4, 5, 1};
    assertEquals(1, solution.findMin(nums));
  }
}
