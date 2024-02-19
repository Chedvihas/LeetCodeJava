import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (map.containsKey(charS)) {
                if (map.get(charS) != charT)
                    return false;
            } else {
                if (map.containsValue(charT))
                    return false;
                map.put(charS, charT);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings solution = new IsomorphicStrings();
        String s1 = "egg";
        String t1 = "add";
        System.out.println("Isomorphic? " + solution.isIsomorphic(s1, t1)); // Output: true

        String s2 = "foo";
        String t2 = "baa";
        System.out.println("Isomorphic? " + solution.isIsomorphic(s2, t2)); // Output: false
    }
}
