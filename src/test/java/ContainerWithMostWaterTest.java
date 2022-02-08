import junit.framework.TestCase;

public class ContainerWithMostWaterTest extends TestCase {

  private static final ContainerWithMostWater solution = new ContainerWithMostWater();

  public void test1() {
    int[] heights = new int[]{1, 8, 6, 2, 5, 4, 8, 7, 3};
    assertEquals(42, solution.maxArea(heights));
  }
}