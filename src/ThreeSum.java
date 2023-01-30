import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4})); // [-1,-1,2],[-1,0,1]]
    }
    static List<List<Integer>> threeSum(int[] nums) {
        //create a set to store the result
        Set<List<Integer>> res = new HashSet<>();
        //sort the input nums
        Arrays.sort(nums);
        //iterate through nums
        for(int i=0; i<nums.length-2; i++) {
            var curr=nums[i];
            //create left and right pointer (i+1, len of the array)
            var left = i+1;
            var right = nums.length - 1;
            //while right is greater than left
            while(right > left) {
                //if current el + right + left equals to 0
                if(curr + nums[right] + nums[left] == 0) {
                    //create a list and add all the elements
                    List<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[left++]);
                    list.add(nums[right--]);
                    //add list to the result
                    res.add(list);
                }
                //else if current el + right + left is greater than 0
                if (curr + nums[right] + nums[left] > 0){
                    //decrement right by 1
                    right--;
                }
                //else
                if(curr + nums[right] + nums[left] < 0){
                    //increment left by 1
                    left++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}

