import java.util.HashMap;

/** Problem: https://leetcode.com/problems/isomorphic-strings/ */
public class IsomorphicStrings {

  public boolean isIsomorphic(String s, String t) {
    var sMap = new HashMap<Character, Character>();
    var tMap = new HashMap<Character, Character>();
    var sBuilder = new StringBuilder();
    var tBuilder = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sMap.putIfAbsent(s.charAt(i), t.charAt(i));
      tMap.putIfAbsent(t.charAt(i), s.charAt(i));
      sBuilder.append(sMap.get(s.charAt(i)));
      tBuilder.append(tMap.get(t.charAt(i)));
    }
    return sBuilder.toString().equals(t) && tBuilder.toString().equals(s);
  }
}
