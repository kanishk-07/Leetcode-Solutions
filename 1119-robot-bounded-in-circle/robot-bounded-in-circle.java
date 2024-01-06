class Solution {
    public boolean isRobotBounded(String ins) {
        char[] arr = ins.toCharArray();
        int n = arr.length, dir = 0, y = 0, x = 0;
        for(int i=0; i<n; i++) {
            if(arr[i]=='G') {
                if(dir==0) y++;
                else if(dir==1) x++;
                else if(dir==2) y--;
                else if(dir==3) x--;
            } else if(arr[i]=='L') {
                dir = (dir+3)%4;
            } else {
                dir = (dir+1)%4;
            }
        }
        return (y==0 && x==0) || (dir!=0);
    }
}