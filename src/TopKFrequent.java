import java.util.*;
public class TopKFrequent {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2))); //[1,2]
    }
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> bucket[] = new ArrayList[nums.length + 1];

        for (int num : nums)
            //if the key is not in the map, add it with the value of 1, if it is, update the value by value++
            count.merge(num, 1, Integer::sum);
        //iterate through the map keys
        for (int key : count.keySet()){
            //get the value of the key to use as an index freq
            int freq = count.get(key);
            //if bucket at the freq index is null assign to an empty list
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            //add key to the list
            bucket[freq].add(key);
        }
        //create an index variable and assign it to 0
        int index = 0;
        //create an array to store the result
        int[] res = new int[k];
        //iterate through nums in descending order
        for (int i = nums.length; i >= 0; i--)
            //if the bucket at i index is not null, loop through bucket list
            if (bucket[i] != null)
                //assign res variable using the index to the element that is inside of bucket list and update index by 1
                for (int val : bucket[i]){
                    res[index++] = val;
                    //if index and k are igual, return res
                    if(index == k)
                        return res;
                }
        return res;
    }
}
