import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
//        Given an integer array nums, return true if any value appears at least twice in the array,
//                and return false if every element is distinct.

        System.out.println(containsDuplicate(new int[] {1,2,3,1})); // true
        System.out.println(containsDuplicate(new int[] {1,2,3,4})); // false
    }
    static boolean containsDuplicate(int[] nums) {
        //create a set to store seen numbers
        Set<Integer> seen = new HashSet<>();
        //iterate through nums
        for(var num: nums) {
            //check if num is in seen
            if(seen.contains(num)) {
                //if yes, return true
                return true;
            }
            //add num to seen
            seen.add(num);
        }
        //return false outside the loop
        return false;
    }
}
