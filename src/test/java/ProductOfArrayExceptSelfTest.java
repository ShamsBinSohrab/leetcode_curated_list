import static org.junit.Assert.assertArrayEquals;

import junit.framework.TestCase;

public class ProductOfArrayExceptSelfTest extends TestCase {

  private static final ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();

  public void test1() {
    var nums = new int[] {1, 2, 3, 4};
    assertArrayEquals(new int[] {24, 12, 8, 6}, solution.productExceptSelf(nums));
  }

  public void test2() {
    var nums = new int[] {-1, 1, 0, -3, 3};
    assertArrayEquals(new int[] {0, 0, 9, 0, 0}, solution.productExceptSelf(nums));
  }
}
