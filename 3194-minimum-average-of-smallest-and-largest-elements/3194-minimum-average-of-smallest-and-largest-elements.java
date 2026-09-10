class Solution { 
    public double minimumAverage(int[] nums) { 
        double average_min = Double.MAX_VALUE; 
        int count = nums.length;
        while (count > 0) { 
            int max_n = Integer.MIN_VALUE; 
            int min_n = Integer.MAX_VALUE;
            int maxIndex = -1;
            int minIndex = -1;
            for (int i = 0; i < nums.length; i++) { 
                if (nums[i] == 0) continue; 
                if (nums[i] > max_n) {
                    max_n = nums[i];
                    maxIndex = i;
                }  
                if (nums[i] < min_n) {
                    min_n = nums[i];
                    minIndex = i;
                }
            } 
            double avg = (max_n + min_n) / 2.0; 
            average_min = Math.min(avg, average_min); 
            nums[minIndex] = 0;
            nums[maxIndex] = 0;
            count -= 2;
        } 
        return average_min;
    } 
}