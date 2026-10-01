class Solution {
    public boolean isValid(String s) {
        Stack<Character> obj=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(') obj.push(')');
            else if(c=='[') obj.push(']');
            else if(c=='{') obj.push('}');
            else if(obj.isEmpty() || obj.pop() !=c){
                return false;
            }
        }
        return obj.isEmpty();
    }
}