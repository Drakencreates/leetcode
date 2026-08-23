class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String>st = new Stack<>();

        for(String s:str){
          
            
           if(s.equals(".")||s.equals(""))continue;
            else if( s.equals("..")){
                if(!st.isEmpty()){
                st.pop();
                }
               
            }
             else{
            st.push(s);
            }
            

        }
        StringBuilder path1 = new StringBuilder();
        for(String dr:st){
            path1.append("/").append(dr);
        }
       return path1.length()==0 ? "/":path1.toString();

        
    }
}