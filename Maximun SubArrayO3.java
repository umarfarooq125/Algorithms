class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        
        for(int i = 0 ; i < nums.length ; i++) {
            
            for(int j = i; j < nums.length ; j++) {
                
                int currSum = 0;
                for(int k = i ; k <= j ; k++) {
                    currSum += nums[k];
                }
                
                sum = Math.max(currSum, sum);
            }
        }
        
        return sum;
    }
}
