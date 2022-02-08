import junit.framework.TestCase;

public class CoinChangeTest extends TestCase {

  private static final CoinChange solution = new CoinChange();

  public void test1() {
    int[] nums = new int[] {1, 4, 3, 5};
    assertEquals(2, solution.coinChange(nums, 7));
  }

  public void test2() {
    int[] nums = new int[] {1, 2, 5};
    assertEquals(3, solution.coinChange(nums, 11));
  }

  public void test3() {
    int[] nums = new int[] {2};
    assertEquals(-1, solution.coinChange(nums, 3));
  }
}
