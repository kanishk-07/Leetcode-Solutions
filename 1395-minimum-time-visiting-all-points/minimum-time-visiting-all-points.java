class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for(int i=1; i<points.length; i++) {
            time+=minTime(points[i], points[i-1]);
        }
        return time;
    }
    private int minTime(int[] a, int[] b) {
        int xDiff = Math.abs(b[0]-a[0]);
        int yDiff = Math.abs(b[1]-a[1]);
        int min = Math.min(xDiff, yDiff);
        int time = min;
        if(min==xDiff) {
            time+=(yDiff-min);
        } else {
            time+=(xDiff-min);
        }
        return time;
    }
}