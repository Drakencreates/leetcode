class Solution {
    public String longestPalindrome(String s) {
int ind1=-1;
int ind2=-1;
int max = Integer.MIN_VALUE;

int n = s.length();

        boolean[][]dp = new boolean[n][n];


        for(int l=1;l<=n;l++){

            for(int i=0;i+l-1<n ; i++){
                int j=i+l-1;

                if(i==j){
                    dp[i][j]=true;
                  

                }
               else if(j==i+1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j] = true;
                    }
                }

                else {
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                    dp[i][j] = true;
                }
                }



                if(dp[i][j]==true && j-i+1 > max){
                    max=j-i+1;
                    ind1=i;
                    ind2=j;
                    



                 
                }
               
            }
        }

return s.substring(ind1,ind2+1);




        
  

    }
}








