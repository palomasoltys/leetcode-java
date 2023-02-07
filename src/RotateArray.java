import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3)));
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5)));

    }

//    Given an array of integers and a value 'n', rotate the values in the array forward by 'n' positions.
//
//            Example:
//            [1, 2, 3, 4, 5, 6, 7, 8, 9], 3
//            => [7, 8, 9, 1, 2, 3, 4, 5, 6]

//            [1, 2, 3, 4, 5, 6, 7, 8, 9], 5
//            => [5, 6, 7, 8, 9, 1, 2, 3]


    static int[] rotateArray(int[] arr, int n) {
        n=n% arr.length;
        //reverse whole array
        reverseArray(arr, 0, arr.length - 1);
        //reverse first n elements in array
        reverseArray(arr, 0, n-1);
        //reverse array after n elements
        reverseArray(arr, n, arr.length - 1);

        return arr;

    }
    static void reverseArray(int[] nums, int start, int end) {
        //reverse array
        while(start < end) {
            var temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
