package yang.org;

class Solution1905 {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int result = 0;
        int n = grid1.length;
        int m = grid1[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid1[i][j] == 0 && grid2[i][j] == 1){
                    dfs(grid2,i,j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid2[i][j] == 1){
                    result++;
                    dfs(grid2,i,j);
                }
            }
        }

        return result;
    }
    public void dfs(int[][] grid,int x,int y){
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length){
            return;
        }
        if(grid[x][y] == 0){
            return;
        }
        grid[x][y] = 0;

        dfs(grid,x + 1,y);
        dfs(grid,x - 1,y);
        dfs(grid,x,y + 1);
        dfs(grid,x,y - 1);
    }
}