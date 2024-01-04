class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length)
            return findMedianSortedArrays(nums2, nums1);
        int n1 = nums1.length, n2 = nums2.length;
        // even then (n1+n2)/2-1 & (n1+n2)/2
        // odd then (n1+n2)/2
        int y = (n1+n2)/2, l = 0, r = n1;
        while(l<=r) {
            int k1 = (l+r)/2, k2 = y-k1;
            int l1 = k1==0 ? Integer.MIN_VALUE : nums1[k1-1];
            int l2 = k2==0 ? Integer.MIN_VALUE : nums2[k2-1];
            int r1 = k1==n1 ? Integer.MAX_VALUE : nums1[k1];
            int r2 = k2==n2 ? Integer.MAX_VALUE : nums2[k2];
            if(l1>r2) {
                r = k1-1;
            } else if(l2>r1) {
                l = k1+1;
            } else {
                if((n1+n2)%2==0)
                    return (Math.max(l1, l2)+Math.min(r1, r2))/2.0;
                else
                    return Math.min(r1, r2);
            }
        }
        return 0;
    }
}