class Solution {
    public void solveSudoku(char[][] board) {
        
        solve(board);
    }
   public boolean solve(char[][]grid){

for(int i=0;i<grid.length;i++){
    for(int j=0;j<grid[0].length;j++){
        if(grid[i][j]=='.'){

            for(char c='1';c<='9';c++){
                if(isValid(grid,i,j,c)){
                    grid[i][j] = c;

                    if(solve(grid)==true){
                        return true;
                    }
                   grid[i][j] = '.';
                }
            }
            return false;




        }
  


    }
}
      return true;
   }
   

   

public boolean isValid(char[][]grid,int r,int col,char c){
    for(int i=0;i<9;i++){
        if(grid[r][i]==c)return false;

        if(grid[i][col]==c)return false;

        if(grid[3*(r/3)+(i/3)][3*(col/3)+(i%3)]==c){
            return false;
        }

    }
return true;
 
}
}
