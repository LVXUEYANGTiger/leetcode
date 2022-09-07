class Solution {
    public int closedIsland(int[][] grid) {
        int result = 0;
        int n = grid.length;
        int m = grid[0].length;
        // 左边和右边
        for (int i = 0; i < n; i++) {
            dfs(grid,i,0);
            dfs(grid,i, m - 1);
        }
        // 上面和下面
        for (int i = 1; i < m; i++) {
            dfs(grid,0,i);
            dfs(grid,n - 1, i);
        }

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] == 0){
                    result++;
                    dfs(grid,i,j);
                }
            }
        }

        return result;
    }
    public void dfs(int[][] grid,int x,int y) {
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length){
            return;
        }
        if(grid[x][y] == 1){
            return;
        }
        grid[x][y] = 1;
        dfs(grid,x + 1,y);
        dfs(grid,x - 1,y);
        dfs(grid,x,y + 1);
        dfs(grid,x,y - 1);
    }
}