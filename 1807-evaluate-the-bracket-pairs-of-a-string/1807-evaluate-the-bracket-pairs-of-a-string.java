class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        Map<String,String> data = new HashMap<>();
        StringBuilder st = new StringBuilder();

        for(int i=0;i<knowledge.size();i++){
          
                data.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
            

        }
        
int ind1=0;
int ind2 = 0;

        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='('){
            ind1 = j;
                for(int k=j;k<s.length();k++){
                    if(s.charAt(k)==')'){
                        ind2 = k;
                        break;

                    }

                }

                String sub = s.substring(ind1+1,ind2);

                if(data.containsKey(sub)){
                    st.append(data.get(sub));

                }
                else{
                    st.append('?');
                }
                j = ind2;
            }
            else{

            st.append(s.charAt(j));
            }

        }



        return st.toString().trim();








        
    }
}