import junit.framework.TestCase;

public class LongestSubstringWithoutRepeatingCharactersTest extends TestCase {

  private static final LongestSubstringWithoutRepeatingCharacters solution =
      new LongestSubstringWithoutRepeatingCharacters();

  public void test1() {
    assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
  }

  public void test2() {
    assertEquals(4, solution.lengthOfLongestSubstring("abcdabcbb"));
  }

  public void test3() {
    assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
  }

  public void test4() {
    assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
  }

  public void test5() {
    assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
  }

  public void test6() {
    assertEquals(2, solution.lengthOfLongestSubstring("abba"));
  }
}
