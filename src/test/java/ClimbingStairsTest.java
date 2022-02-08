import junit.framework.TestCase;

public class ClimbingStairsTest extends TestCase {

  private static final ClimbingStairs solution = new ClimbingStairs();

  public void test1() {
    assertEquals(3, solution.climbStairs(3));
  }

  public void test2() {
    assertEquals(8, solution.climbStairs(5));
  }

  public void test3() {
    assertEquals(1, solution.climbStairs(1));
  }

  public void test4() {
    assertEquals(2, solution.climbStairs(2));
  }
}