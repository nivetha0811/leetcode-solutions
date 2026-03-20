class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0)return 0;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    help(grid,i,j);
                }
            }
        }
        return count;
    }
    public void help(char[][] grid,int i,int j){
        if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1)return;
        if(grid[i][j]=='0')return;

        grid[i][j]='0';

        help(grid,i+1,j);//down
        help(grid,i-1,j);//up;
        help(grid,i,j+1);//right
        help(grid,i,j-1);//left
    }
}