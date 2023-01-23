import java.util.*;
public class TwoSum {
    public static void main(String[] args) {

//        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//        You can return the answer in any order.

        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9))); // [0,1] or [1,0]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6))); // [1,2] or [2,1]
    }
    static int[] twoSum(int[] nums, int target) {
        //create a map to store the nums and their indexes
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            //if target - nums[i] in map, return the value of the map and i
            var addUp = target - nums[i];
            if(map.containsKey(addUp)) {
                return new int[] {i, map.get(addUp)};
            }
            //add element to the map
            map.put(nums[i], i);
        }
        return new int[] {0,0};
    }
}
