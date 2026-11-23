class Solution {
    public void duplicateZeros(int[] arr) {
        int[] num = new int[arr.length];
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                if(k < arr.length) num[k++] = 0;
                if(k < arr.length) num[k++] = 0;
            }
            else {
                if(k < arr.length) num[k++] = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = num[i];
        }
    }
}