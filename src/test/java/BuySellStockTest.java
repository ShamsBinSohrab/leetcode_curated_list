import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BuySellStockTest {

  private static final BuySellStock solution = new BuySellStock();

  @Test
  void test1() {
    var prices = new int[] {7, 1, 5, 3, 6, 4};
    assertEquals(5, solution.maxProfit(prices));
  }

  @Test
  void test2() {
    var prices = new int[] {7, 6, 4, 3, 1};
    assertEquals(0, solution.maxProfit(prices));
  }
}
