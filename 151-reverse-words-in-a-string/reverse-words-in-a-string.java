class Solution {
    public String reverseWords(String string) {
        if(string==" ")
            return " ";
        string = string.trim();
        
        String s = String.valueOf(string.charAt(0));
        int l = string.length();
        for(int i=1;i<l;i++) {
            if(string.charAt(i)==' ' && string.charAt(i-1)==' ')
                continue;
            s = s + String.valueOf(string.charAt(i));
        }
        
        String[] str = s.split(" ");
        String ans = str[0];
        for(int i=1;i<str.length;i++)
            ans = str[i] + " " + ans;
        return ans;
    }
}