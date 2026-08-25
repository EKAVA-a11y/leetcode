class Solution {
    public int[] finalPrices(int[] prices) {
        int[] answer=new int [prices.length];
        for(int i=0;i<prices.length;i++){
            answer[i]=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(j > i && prices[j] <= prices[i]){
                    answer[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return answer;
    }
}