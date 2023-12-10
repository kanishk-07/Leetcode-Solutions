class Solution {
    public String removeStars(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        String ans = "";
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++) {
            if(arr[i]=='*')
                stack.pop();
            else
                stack.push(arr[i]);
        }
        while(!stack.isEmpty()) {
            ans = String.valueOf(stack.pop()) + ans;
        }
        return ans;
    }
}