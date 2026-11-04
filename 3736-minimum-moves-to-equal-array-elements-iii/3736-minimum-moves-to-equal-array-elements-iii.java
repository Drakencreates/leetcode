class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count=0;

for(int i=0;i<nums.length;i++){
max= Math.max(max, nums[i]);
    count += nums[i];


}



     return Math.abs(count-(nums.length*max));   
    }
}