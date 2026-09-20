class Solution {
    public int reverseDegree(String s) {
        int[] arr=new int[26];
        int k=0;
        for(int i=26;i>0;i--){
            arr[k++]=i;
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum=(i+1)*arr[s.charAt(i)-'a']+sum;
        }
        return sum;
    }
}