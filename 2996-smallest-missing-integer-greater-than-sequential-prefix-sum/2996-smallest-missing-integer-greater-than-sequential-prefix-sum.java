class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1!=nums[i]){
                break;
            }
            else{
                sum+=nums[i];
            }
        }
        Set<Integer>set = new HashSet<>();
        for(int x:nums){
set.add(x);
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}