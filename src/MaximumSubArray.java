public class MaximumSubArray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4})); // 6
    }

    static int maxSubArray(int[] nums) {
        //create a max variable to store the result
        int max = nums[0];
        //create a variable to keep track of the sum
        int sum = 0;

        //iterate through nums
        for(var n : nums) {
            //if sum is a negative number, reassign sum to 0
            if(sum<0) {sum = 0;}
            //update sum with the current element
            sum += n;
            //get the max between max and sum
            max = Math.max(sum, max);
        }

        //return max
        return max;
    }
}
