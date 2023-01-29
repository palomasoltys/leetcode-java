import java.util.*;
public class EncodeAndDecodeStrings {

    public static void main(String[] args) {
        System.out.println(encode(List.of(new String[]{"lint", "code", "love", "you"}))); // "lint:;code:;love:;you"
        System.out.println(decode("lint:;code:;love:;you")); //{"lint", "code", "love", "you"}
    }

    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    static String encode(List<String> strs) {
        //create empty string to store result
        String res = "";
        // loop through list of strings
        for(int i=0; i<strs.size(); i++) {
            //add current string to result
            res+=strs.get(i);
            //if current str is not the last element of the list
            if(i != strs.size() - 1) {
                //add colen to string
                res+=":";
                //add semi colen to string
                res+=";";
            }
        }
        //return res
        return res;
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    static List<String> decode(String str) {
        //split string by colen and semi colen
        var list = str.split(":;");
        return List.of(list);
    }
}
