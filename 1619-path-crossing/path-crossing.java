class Solution {
    public boolean isPathCrossing(String path) {
        char[] arr = path.toCharArray();
        int n = arr.length, x=0, y=0;
        Set<ArrayList<Integer>> set = new HashSet<>();
        set.add(new ArrayList<>(List.of(0, 0)));
        for(int i=0; i<n; i++) {
            if(arr[i]=='N')
                y++;
            else if(arr[i]=='S')
                y--;
            else if(arr[i]=='E')
                x++;
            else
                x--;
            ArrayList<Integer> point = new ArrayList<>(List.of(x, y));
            if(set.contains(point))
                return true;
            set.add(point);
        }
        return false;
    }
}