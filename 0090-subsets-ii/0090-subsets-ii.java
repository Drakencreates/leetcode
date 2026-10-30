class Solution {
Set<List<Integer>>m = new HashSet<>();
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>l = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(l,nums,0,nums.length,ans);
        return ans;
        

        
    }

    public void backtrack(List<Integer>l,int[]nums,int i,int n,List<List<Integer>>ans){

        if(i==n){
            if(!m.contains(new ArrayList(l))){
                m.add(l);
                ans.add(new ArrayList<>(new ArrayList(l)));
              


            }
              return;
          
        }
        l.add(nums[i]);
        backtrack(l,nums,i+1,n,ans);
        l.remove(l.size()-1);
        backtrack(l,nums,i+1,n,ans);
    }
}