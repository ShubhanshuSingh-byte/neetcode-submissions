class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] res = new int[intervals.length][2];
        int j = 0;

        res[0] = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= res[j][1]) {
                res[j][1] = Math.max(res[j][1], intervals[i][1]);
            } else {
                res[++j] = intervals[i];
            }
        }

        return Arrays.copyOf(res, j + 1);
    }
}
