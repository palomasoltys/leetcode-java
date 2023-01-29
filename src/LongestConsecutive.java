import java.util.*;
public class LongestConsecutive {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[] {100,4,200,1,3,2})); // 4
    }

    static int longestConsecutive(int[] nums) {
        if(nums.length == 0) {return 0;}
        //create a set and initialize to nums
        Set<Integer> set = new HashSet<>();
        for(var n : nums) {set.add(n);}
        //create max variable to keep track of res
        int max = 1;
        //iterate through nums
        for(var n : nums) {
            //if current element - 1 is not in set
            if(!set.contains(n-1)) {
                //create count variable and set it to 1
                int count = 1;
                //while element + 1 is in set
                while(set.contains(n+1)) {
                    //increment count by 1
                    count++;
                    n++;
                    //get max value between max and count
                    max = Math.max(max, count);
                }
            }
        }
        //return max
        return max;
    }
}
