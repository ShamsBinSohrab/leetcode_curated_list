import static org.junit.Assert.assertArrayEquals;

import junit.framework.TestCase;

public class TwoSumTest extends TestCase {

  private static final TwoSum solution = new TwoSum();

  public void test1() {
    var nums = new int[]{2, 7, 11, 15};
    var target = 9;
    assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
  }

  public void test2() {
    var nums = new int[]{3, 2, 4};
    var target = 6;
    assertArrayEquals(new int[]{1, 2}, solution.twoSum(nums, target));
  }

  public void test3() {
    var nums = new int[]{3, 3};
    var target = 6;
    assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
  }

  public void test4() {
    var nums = new int[]{3, 2, 3};
    var target = 6;
    assertArrayEquals(new int[]{0, 2}, solution.twoSum(nums, target));
  }
}
