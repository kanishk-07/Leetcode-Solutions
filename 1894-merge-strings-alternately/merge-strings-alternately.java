class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        String ans = "";
        int i=0, j=0, n1 = arr1.length, n2 = arr2.length;
        while(i<n1 && j<n2) {
            if(i>j)
                ans = ans + String.valueOf(arr2[j++]);
            else
                ans = ans + String.valueOf(arr1[i++]);
        }
        while(i<n1) ans = ans + String.valueOf(arr1[i++]);
        while(j<n2) ans = ans + String.valueOf(arr2[j++]);
        return ans;
    }
}