class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        boolean allzero = true;
        for(int x:nums){
            if(x!=0){
                allzero = false;
                break;
            }


        }
        if(allzero)return 0;
        
        
          for(int n:nums){
            xor^=n;
          }
          if(xor!=0)return nums.length;
          return nums.length-1;




       }
       
       
       
        
    
}