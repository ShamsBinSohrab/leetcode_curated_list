import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

  private static final ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();

  @Test
  void test1() {
    var nums = new int[] {1, 2, 3, 4};
    Assertions.assertArrayEquals(new int[] {24, 12, 8, 6}, solution.productExceptSelf(nums));
  }

  @Test
  void test2() {
    var nums = new int[] {-1, 1, 0, -3, 3};
    Assertions.assertArrayEquals(new int[] {0, 0, 9, 0, 0}, solution.productExceptSelf(nums));
  }
}
