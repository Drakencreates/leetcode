class Solution {
    public int rob(int[] nums) {
        
        Integer[]dp  =new Integer[nums.length];
        Integer[]dp2  =new Integer[nums.length];
        int n = nums.length;

if(n==1)return nums[0];
        int rob1 = solver(nums,0,n-2,dp);
        int rob2 = solver(nums,1,n-1,dp2);

        return Math.max(rob1,rob2);


    }
    public int solver(int[]nums,int i,int end,Integer[]dp){
        if(i>end)return 0;
        if(dp[i]!=null)return dp[i];

        int rob = nums[i]+solver(nums,i+2,end,dp);
        int skip = solver(nums,i+1,end,dp);

        return dp[i] = Math.max(rob,skip);

    }
}