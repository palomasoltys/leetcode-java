import java.util.*;
public class MeetingRooms {
      public class Interval {
      int start, end;
      Interval(int start, int end) {
          this.start = start;
          this.end = end;
      }
 }
    public boolean canAttendMeetings(List<Interval> intervals) {
        //sort intervals by the start
        Collections.sort(intervals, (a, b) -> a.start - b.start);
        // iterate through intervals
        for(int i=0; i< intervals.size() - 1;i++) {
            //if current end is greater than next start, return false
            if(intervals.get(i).end > intervals.get(i+1).start) {
                return false;
            }
        }
        //return true
        return true;
    }
}
