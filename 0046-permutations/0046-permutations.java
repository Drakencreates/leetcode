class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
List<Integer> l=new ArrayList<>();
boolean[]used = new boolean[nums.length];
Arrays.sort(nums);

backtrack(l,nums,used,ans);
return ans;

    }

    public void backtrack(List<Integer> l,int[]arr,boolean[]used,List<List<Integer>> ans){

        if(l.size()==arr.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(used[i]){
                continue;
            }
            l.add(arr[i]);
            used[i]=true;
            backtrack(l,arr,used,ans);
            l.remove(l.size()-1);
            used[i]=false;

        }


    }
    
   
}
