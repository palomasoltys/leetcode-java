import java.util.*;
public class CharacterReplacementString {

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2)); // 4
    }

    static int characterReplacement(String s, int k) {
        //create a max variable and mostFreq variable
        int max = 0;
        int mostFreq = 0;
        //create a left 0 and right 1 pointers
        int left = 0;
        int right = 0;
        //create a map to map the chars and its frequencies
        Map<Character, Integer> map = new HashMap<>();
        //iterate through s using while
        while(right < s.length()) {
            char c = s.charAt(right);

            // Store each character along with its frequency
            // and get the most freq char in the current window
            map.put(c, map.getOrDefault(c, 0) + 1);
            mostFreq = Math.max(map.get(c), mostFreq);

            //if len of curr window - mostFreq is less or equal to k, update max
            if(right - left + 1 - mostFreq <= k) {
                max = Math.max(max, right - left + 1);
            } else {
                // Move the left pointer to the next charater
                // and update its frequency in map
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            right++;
        }
        return max;
    }
}
