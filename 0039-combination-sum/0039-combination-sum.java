class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
List<Integer>l = new ArrayList<>();
List<List<Integer>>ans = new ArrayList<>();
Arrays.sort(candidates);

backtrack(candidates,0,target,l,ans);
return ans;

        
    }
    public void backtrack(int[]arr,int i,int target,List<Integer>l,List<List<Integer>>ans){
        if (target == 0) {
            ans.add(new ArrayList<>(l));
            return;
        }

        if (i == arr.length || target < 0) {
            return;
        }

        l.add(arr[i]);
        backtrack(arr,i,target-arr[i],l,ans);
        l.remove(l.size()-1);
         backtrack(arr,i+1,target,l,ans);
        
        
    }
}