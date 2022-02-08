import java.util.Arrays;

/** Problem: https://leetcode.com/problems/coin-change/ */
public class CoinChange {
  public int coinChange(int[] coins, int amount) {
    int[] array = new int[amount + 1];
    Arrays.setAll(array, i -> i == 0 ? 0 : Integer.MAX_VALUE);
    for (int i = 1; i <= amount; i++) {
      for (int coin : coins) {
        if (i - coin >= 0 && array[i - coin] != Integer.MAX_VALUE) {
          array[i] = Math.min(array[i], 1 + array[i - coin]);
        }
      }
    }
    return array[amount] == Integer.MAX_VALUE ? -1 : array[amount];
  }
}
