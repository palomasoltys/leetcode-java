import java.util.*;
public class MeetingRoomsII {

      public static class Interval {
      int start, end;
      Interval(int start, int end) {
          this.start = start;
          this.end = end;
      }
  }

    public int minMeetingRooms(List<Interval> intervals) {
        //if intervals is empty return 0
        if(intervals.isEmpty()) {return 0;}
        //create a variable to store the result and the count
        int count = 0;
        int max = 0;
        //sort the intervals by the start
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        // create start and populate
        List<Integer> start = new ArrayList<>();
        for(var interval : intervals) {
            start.add(interval.start);
        }
        //sort the intervals by the end
        Collections.sort(intervals, (a, b) -> Integer.compare(a.end, b.end));
        // create end and populate
        List<Integer> end = new ArrayList<>();
        for(var interval : intervals) {
            end.add(interval.end);
        }
        int s = 0;
        int e = 0;
        //iterate through both list at the same time
        while(s < start.size()) {
            //whenever a meeting starts, increment count and update max
            if(start.get(s) < end.get(e) ) {
                count++;
                max = Math.max(max, count);
                s++;
            } else {
                //whenever a meeting ends, decrement count
                count--;
                e++;
            }
        }
        //return max
        return max;
    }
}
