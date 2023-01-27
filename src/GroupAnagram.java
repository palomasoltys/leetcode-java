import java.util.*;
public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create a list to store the result
        List<List<String>> res = new ArrayList<>();
        if(strs.length == 0) {return res;}
        //create a map to store the anagrams
        HashMap<String, List<String>> map = new HashMap<>();
        //iterate through the strs
        for(var s : strs) {
            //create a count variable array
            char[] hash = new char[26];
            for(var c: s.toCharArray()) {
                //count how many letters and wich letters each word has
                hash[c - 'a']++;
            }
            String key = new String(hash);
            //update map with the key and the value
            map.computeIfAbsent(key, k-> new ArrayList<>());
            map.get(key).add(s);
        }
        //add the map values to res
        res.addAll(map.values());
        return res;

    }
}
