import java.util.Arrays;

public class CountBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5))); // [0,1,1,2,1,2]
    }

//    Given an integer n, return an array ans of length n + 1 such that
//    for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
    static int[] countBits(int n) {
        //create an arr of n + 1 size
        int[] arr = new int[n+1];
        //iterate with n + 1 as the range
        for(int i=0; i<n+1;i++) {
            //convert each el to binary
            var bin = Integer.toBinaryString(i);
            //count how many 1's in the binary string
            var ones = bin.chars().filter(ch -> ch == '1').count();
            //assign count to the result arr
            arr[i] = Math.toIntExact(ones);
        }
        //return result arr
        return arr;
    }
}
