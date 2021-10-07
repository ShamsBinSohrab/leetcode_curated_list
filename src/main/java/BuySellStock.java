/** Problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ */
public class BuySellStock {

  public int maxProfit(int[] prices) {
    var profit = 0;
    var buy = prices[0];
    for (int price : prices) {
      profit = Math.max(profit, price - buy);
      buy = Math.min(price, buy);
    }
    return profit;
  }
}
