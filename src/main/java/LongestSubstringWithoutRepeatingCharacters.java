import java.util.HashMap;

/** Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/ */
public class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    var characterSet = new HashMap<Character, Integer>();
    int maxLength = 0, front = 0, rear = 0;
    while (rear < s.length()) {
      char ch = s.charAt(rear);
      if (characterSet.containsKey(ch)) {
        int index = characterSet.remove(ch);
        front = Math.max(front, index);
      } else {
        characterSet.put(ch, ++rear);
        maxLength = Math.max(maxLength, rear - front);
      }
    }
    return maxLength;
  }
}
