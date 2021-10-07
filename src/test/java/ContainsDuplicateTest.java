import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

  private static final ContainsDuplicate solution = new ContainsDuplicate();

  @Test
  void test1() {
    var nums = new int[] {1, 2, 3, 1};
    assertTrue(solution.containsDuplicate(nums));
  }

  @Test
  void test2() {
    var nums = new int[] {1, 2, 3, 4};
    assertFalse(solution.containsDuplicate(nums));
  }

  @Test
  void test3() {
    var nums = new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    assertTrue(solution.containsDuplicate(nums));
  }
}
