import java.util.*;
public class CountCharacters {

    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"cat","bt","hat","tree"}, "atach")); //6
    }

    static int countCharacters(String[] words, String chars) {
        //create a variable string to keep track of matching strings
        String fit = "";
        //loop through words
        for(var word: words) {
            //create a map to map the characters of chars and its frequencies
            Map<Character, Integer> map = new HashMap<>();
            //populate the map
            for(var ch : chars.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) +1);
            }
            for(int i=0; i<word.length(); i++) {
                //if curr letter not in hashmap or value is less than 1, break the loop
                if(!map.containsKey(word.charAt(i)) || map.get(word.charAt(i)) < 1) {break;}
                //if curr in map and value greater or equal 1
                if(map.containsKey(word.charAt(i)) && map.get(word.charAt(i)) >= 1) {
                    //decrement the value of map by one
                    map.put(word.charAt(i), map.get(word.charAt(i))-1);
                    //if curr letter is the last letter of word, add word to string result
                    if(i == word.length() - 1) {
                        fit+=word;
                    }
                }
            }
        }
        //return string results length
        return fit.length();
    }
}
