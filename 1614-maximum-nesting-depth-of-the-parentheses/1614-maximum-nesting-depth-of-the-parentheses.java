class Solution {
    public int maxDepth(String s) {
        Stack<Character> obj=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                obj.push('(');
                count=Math.max(count,obj.size());
            }
            else if(s.charAt(i)==')') obj.pop();
            else continue;
        }
        return count;
    }
}