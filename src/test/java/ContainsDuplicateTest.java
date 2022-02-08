import junit.framework.TestCase;

public class ContainsDuplicateTest extends TestCase {

  private static final ContainsDuplicate solution = new ContainsDuplicate();

  public void test1() {
    var nums = new int[]{1, 2, 3, 1};
    assertTrue(solution.containsDuplicate(nums));
  }

  public void test2() {
    var nums = new int[]{1, 2, 3, 4};
    assertFalse(solution.containsDuplicate(nums));
  }

  public void test3() {
    var nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    assertTrue(solution.containsDuplicate(nums));
  }
}
