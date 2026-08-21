class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        List<List<String>>list  = new ArrayList<>();
        if(strs.length==0)return list;
        HashMap<String,List<String>>map= new HashMap<>();

        for(String s:strs){
            char[]c = s.toCharArray();
            Arrays.sort(c);
            String str = new String(c);

            map.putIfAbsent(str,new ArrayList<>());
            map.get(str).add(s);

        }
        list.addAll(map.values());

return list;
    
    }
}