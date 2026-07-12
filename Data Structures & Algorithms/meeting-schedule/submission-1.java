/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int prev = 0;
        intervals.sort(Comparator.comparingInt(a ->a.start));
        for(Interval a: intervals){
            if(a.start<prev) return false;
            prev = a.end;
        }
        return true;
    }
}
