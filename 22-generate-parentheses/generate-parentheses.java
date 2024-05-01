class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<String>();
        generateParenthesis(ans, n, "", 0, 0);
        return ans;
    }

    private void generateParenthesis(ArrayList<String> ans, int n, String curr, int o, int c) {
        if(curr.length()==2*n) {
            if(o==c)
                ans.add(curr);
            return;
        }
        generateParenthesis(ans, n, curr + "(", o+1, c);
        if(o>c)
            generateParenthesis(ans, n, curr + ")", o, c+1);
    }
}