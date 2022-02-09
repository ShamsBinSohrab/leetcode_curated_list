import junit.framework.TestCase;

public class IsomorphicStringsTest extends TestCase {

  private static final IsomorphicStrings solution = new IsomorphicStrings();

  public void test1() {
    assertTrue(solution.isIsomorphic("egg", "add"));
  }

  public void test2() {
    assertFalse(solution.isIsomorphic("foo", "bar"));
  }

  public void test3() {
    assertTrue(solution.isIsomorphic("paper", "title"));
  }

  public void test4() {
    assertFalse(solution.isIsomorphic("badc", "baba"));
  }
}
