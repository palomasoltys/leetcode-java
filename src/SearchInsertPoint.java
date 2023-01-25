public class SearchInsertPoint {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {1,3,5,6}, 7)); //4
//        Given a sorted array of distinct integers and a target value, return the index if the target is found.
//        If not, return the index where it would be if it were inserted in order.
    }

    static int searchInsert(int[] nums, int target) {
        //create a index pointer to loop through nums
        int index = 0;
        //while we are not at the end of the array
        while(index < nums.length) {
            //if nums at the index is equal to target return index
            if(nums[index] == target) {
                return index;
            } else {
                //if current num is less than target return index
                if(nums[index] < target) {
                    index++;
                } else {
                    return index;
                }
                //if we are at the last element and target is greater than last element
                if(index == nums.length) {
                    //return index + 1
                    return index;
                }
            }
        }
        return 0;
    }
}
