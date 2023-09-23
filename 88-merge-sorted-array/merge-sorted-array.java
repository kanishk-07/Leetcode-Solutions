class Solution {
    public void merge(int[] nums1, int n1, int[] nums2, int n2) {
        int i=0, j=0;
        while(i<n1 && j<n2) {
            if(nums1[i]>nums2[j]) {
                int tmp = nums1[i], k = 0;
                nums1[i] = nums2[j];
                nums2[j] = tmp;
                while(k<n2-1 && nums2[k]>nums2[k+1]) {
                    tmp = nums2[k];
                    nums2[k] = nums2[k+1];
                    nums2[k+1] = tmp;
                    k++;
                }
            }
            i++;
        }
        while(j<n2) {
            nums1[i++] = nums2[j++];
        }
    }
}