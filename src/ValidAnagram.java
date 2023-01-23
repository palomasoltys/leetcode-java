import java.util.*;
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car")); // false;
        System.out.println(isAnagram("ab", "a")); // false
    }
    static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        //create a map to store s
        Map<Character, Integer> mapS = new HashMap<>();
        //create a map to store t
        Map<Character, Integer> mapT = new HashMap<>();
        //iterate through s to update mapS and mapT
        for(int i=0; i<s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0)+ 1);
        }
        //check if they are equal
        return mapS.equals(mapT);

    }
}
