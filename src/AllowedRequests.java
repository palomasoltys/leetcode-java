import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllowedRequests {
    public static void main(String[] args) {
        System.out.println(allowedRequests(new int[]{1, 2, 2, 2, 6, 12, 32, 33, 34, 37}, 3)); // [True, True, True, False, False, True, True, True, True, True]
        System.out.println(allowedRequests(new int[]{1, 3, 3, 5, 6, 10, 11, 12}, 3)); // true, true, true, false, false, true, true, true]
    }

//    Write a function that takes in two parameters: an array of numbers that represent timestamps
//            (in seconds) of API requests, and the maximum number of requests allowed in any 5 second
//    window. The function should return an array which is the same length as the input array,
//    where each item is `true` or `false` depending on whether each request was allowed or rejected.
//
//            Example:
//    allowed_requests(request_timestamps=[1, 2, 2, 2, 6, 12, 32, 33, 34, 37], max_requests=3)
//    [True, True, True, False, False, True, True, True, True, True]
//
//    The first three requests (t=1, t=2, t=2) are allowed, but the 4th request (t=2) is
//    rejected because there were already three requests in the last two seconds. The 5th request
//            (t=6) is also rejected, because there were three requests that happened 4 seconds ago at t=2,
//    so no more requests are allowed until t=7. The rest of the requests are allowed.

//check if you have more requests than allowed in 5s

//            Input = [1,3,3,5,6,10,11,12], 3
//    output: [true, true, true, false, false, true, true, true]

    static List<Boolean> allowedRequests(int[] time, int maxRequest) {
        // create a list of boolean to store the result
        List<Boolean> result = new ArrayList<>();
        // create a list variable to keep track of the last true element
        List<Integer> firstTrue = new ArrayList<>(Arrays.asList(0,0,0)); //
        //create a variable to keep track of the maxRequests
        int limit = 0;
        // iterate through array
        for (int i = 0; i < time.length; i++) {
            //if i less or equal maxRequest
            if (limit < maxRequest) {
                // add true to the result list
                result.add(true);
                // update last true element using the limit as the index
                firstTrue.set(limit, time[i]);
                limit++;
            } else {
                // if current element - last true element is less than 5s
                if (time[i] - firstTrue.get(0) < 5) {
                    // add false to the result list
                    result.add(false);
                    // update first true with the next value of the list
                    firstTrue.set(0, firstTrue.get(1));
                } else {
                    // add true to the result list
                    limit = 0;
                    result.add(true);
                }
            }
        }
        return result;

    }
}
