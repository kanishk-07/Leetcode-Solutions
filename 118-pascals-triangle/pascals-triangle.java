class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> first = new ArrayList<Integer>();
        first.add(1);
        ans.add(first);
        if(numRows==1)
            return ans;
        List<Integer> second = new ArrayList<Integer>();
        second.add(1);
        second.add(1);
        ans.add(second);
        for(int i=3;i<=numRows;i++) {
            List<Integer> curr = new ArrayList<Integer>();
            curr.add(1);
            for(int j=1;j<second.size();j++) {
                curr.add(second.get(j) + second.get(j-1));
            }
            curr.add(1);
            ans.add(curr);
            second = curr;
        }
        return ans;
    }
}