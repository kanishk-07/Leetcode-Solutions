class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cookiesNums = s.length;
        int maxNum = 0, cookieIndex = cookiesNums - 1, childIndex = g.length - 1;
        if(cookiesNums == 0)
            return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(cookieIndex >= 0 && childIndex >=0){
            if(s[cookieIndex] >= g[childIndex]){
                maxNum++;
                cookieIndex--;
                childIndex--;
            }
            else{
                childIndex--;
            }
        }
        return maxNum;
    }
}