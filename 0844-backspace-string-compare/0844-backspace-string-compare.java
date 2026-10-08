class Solution {
    public static String remove(String s) {
        Stack<Character> obj = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '#') {
                if(!obj.isEmpty())
                    obj.pop();
            }
            else {
                obj.push(s.charAt(i));
            }
        }
        String k = "";
        for(char c : obj) {
            k += c;
        }
        return k;
    }

    public boolean backspaceCompare(String s, String t) {
        String s1 = remove(s);
        String s2 = remove(t);
        if(s1.equals(s2))
            return true;
        else
            return false;
    }
}