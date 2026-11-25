class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>box = new ArrayList<>();

        box.add(1);

        for(int i=1;i<=rowIndex;i++){

            for(int j=box.size()-1;j>=1;j--){

                box.set(j,box.get(j)+box.get(j-1));

            }

            box.add(1);



        }
        return box;

        
    }
}