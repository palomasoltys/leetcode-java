public class LongestSubstringWithoutRepetingCharacters {

    public static void main(String[] args) {
        var res = lengthOfLongestSubstring("dvdf");
        System.out.println(res);
    }

    static int lengthOfLongestSubstring(String s) {
        //create a variable to store the res
        int longest = 0;
        //create 2 pointers, left 0 and right 1
        int left = 0;
        int right = 1;
        //iterate while right didnt reach the end of the string
        while(right <= s.length()){
            //create a count variable to count the chars
            int count = 1;
            //while we didnt reach the end of and array and current el is not in the substring
            while(right < s.length() && !s.substring(left, right).contains(String.valueOf(s.charAt(right)))) {
                //increment count
                count++;
                //increment right
                right++;
            }
            //update res with the max count
            longest = Math.max(longest, count);
            //update left to right
            left++;
            //increment right by one
            right = left + 1;
        }
        //return res
        return longest;
    }

}
