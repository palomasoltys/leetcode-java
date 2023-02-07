import java.util.*;
public class ListPeaks {
    public static void main(String[] args) {
        System.out.println(listPeaks(Arrays.asList(6, 1, 6, 5, 8, 13, 7, 2, 15, 12)));
    }

//    Given a list of numbers, a 'peak' is defined as a value that is greater than its two adjacent values, or, if the
//    value is at the front or back of the list, greater than its one adjacent value.
//
//    Given such a list, return a list of all the peak values.
//
//            Example:
//            [6, 1, 6, 5, 8, 13, 7, 2, 15, 18]
//            ^     ^         ^         ^
//            => [6, 6, 13, 15]

    static List<Integer> listPeaks(List<Integer> nums) {
        //create a list to store the result
        List<Integer> peak = new ArrayList<>();
        //iterate through nums
        for(int i=0; i<nums.size()-1; i++) {
            //if its the first element, check if its greater than next element and if yes add to the list
            if(i==0 && nums.get(i) > nums.get(i+1)) {peak.add(nums.get(i));}
            // else if its last element check if ts greater than prev el and if yes add to the list
            else if(i==nums.size()-2 && nums.get(i+1) > nums.get(i)) {peak.add(nums.get(i+1));}
            else {
                // get prev, curr and next and check if curr is grater than prev and greater than next, add to the list
                int prev = nums.get(i-1);
                int curr = nums.get(i);
                int next = nums.get(i+1);
                if(curr > prev && curr > next) {peak.add(curr);}
            }
        }
        return peak;
    }
}
