import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{-1, 0}, -1))); // [1,2]
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6))); //[1,3];
    }

    static int[] twoSum(int[] nums, int target) {
        //[2,5,6,7,8,11,15], target 9. res = [1,4]

        //create left and right pointer, 0 and lenght of the list - 1
        int left = 0;
        int right = nums.length - 1;
        //iterate while right pointer is greater than left pointer
        while(right > left) {
            //if right+left == target
            if(nums[right] + nums[left] == target) {
                //return right+1 and left+1
                return new int[] {left+1, right+1};
            }
            //else if right > target, decrement right -1
            else if(nums[right] > target) {
                right--;
            }
            //else if right+left > target
            else if (nums[right] + nums[left] > target) {
                //decrement right
                right--;
            } else {
                //else increment left
                left++;
            }
        }
        return new int[] {0,0};
    }
}
