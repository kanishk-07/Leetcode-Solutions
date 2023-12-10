class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++) {
            if(asteroids[i]>0) {
                stack.push(asteroids[i]);
            } else {
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<(asteroids[i]*-1)) {
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek()<0) {
                    stack.push(asteroids[i]);
                } else if(-1*stack.peek()==asteroids[i]) {
                    stack.pop();
                }
            }
        }
        int sz = stack.size(), i = sz-1;
        int[] ans = new int[sz];
        while(!stack.isEmpty()) {
            ans[i--] = stack.pop();
        }
        return ans;
    }
}