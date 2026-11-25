class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer>box = new ArrayList<>();
            box.add(1);
            for(int j=1;j<i;j++){
                int sum = ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                box.add(sum);

            }
            if(i>0)box.add(1);
              ans.add(box);

        }
      
return ans;
        
    }

}