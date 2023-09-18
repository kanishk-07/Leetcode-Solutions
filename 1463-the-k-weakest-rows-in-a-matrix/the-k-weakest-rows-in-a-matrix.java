class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(b[0]==a[0] ? b[1]-a[1] : b[0]-a[0]));
        for(int i=0; i<mat.length; i++) {
            pq.add(new int[]{indexOfLast1(mat[i]), i});
            if(pq.size()>k)
                pq.poll();
        }
        for(int i=k-1; i>=0; i--) {
            ans[i] = pq.poll()[1];
        }
        return ans;
    }

    private int indexOfLast1(int[] arr) {
        int n = arr.length;
        int l = 0, r = n-1;
        while(l<=r) {
            int mid = (l+r)/2;
            if(arr[mid]==1)
                l = mid+1;
            else
                r = mid-1;
        }
        return r;
    } 
}