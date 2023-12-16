class Solution {
    static int n;
    HashSet<Integer> keys;
    HashSet<Integer> notKeys;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        keys = new HashSet<Integer>();
        notKeys = new HashSet<Integer>();
        keys.add(0);
        n = rooms.size();
        Stack<Integer> visited = new Stack<Integer>();
        Stack<Integer> aux = new Stack<Integer>();
        for(int i=n-1;i>=0;i--)
            visited.push(i);
        while(keys.size()>0) {
            while(!visited.isEmpty() && !keys.contains(visited.peek())) {
                aux.add(visited.pop());
            }
            if(visited.isEmpty())
                return false;
            List<Integer> al = rooms.get(visited.peek());
            for(int i=0;i<al.size();i++) {
                if(!notKeys.contains(al.get(i)))
                    keys.add(al.get(i));
            }
            keys.remove(visited.peek());
            notKeys.add(visited.pop());
            //System.out.println(keys);
            while(!aux.isEmpty()) {
                visited.add(aux.pop());
            }
        }
        if(visited.isEmpty())
                return true;
        return false;
    }
}