class Solution {
    public List<List<Integer>> subsets(int[] nums) {

List<List<Integer>> ans = new ArrayList<>();
List<Integer> l=new ArrayList<>();
Arrays.sort(nums);
backtrack(l,nums,0,nums.length,ans);
return ans;
        
    }
    public void backtrack(List<Integer> l,int[]arr,int i,int n,List<List<Integer>> ans){
        if(i==n){
           ans.add(new ArrayList<>(l));
           return;
        }
        l.add(arr[i]);
        backtrack(l,arr,i+1,n,ans);
        l.remove(l.size()-1);
         backtrack(l,arr,i+1,n,ans);
    }

}