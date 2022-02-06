import junit.framework.TestCase;

public class BuySellStockTest extends TestCase {

  private static final BuySellStock solution = new BuySellStock();

  public void test1() {
    var prices = new int[]{7, 1, 5, 3, 6, 4};
    assertEquals(5, solution.maxProfit(prices));
  }

  public void test2() {
    var prices = new int[]{7, 6, 4, 3, 1};
    assertEquals(0, solution.maxProfit(prices));
  }
}
