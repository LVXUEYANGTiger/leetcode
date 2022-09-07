package yang.org;

class SolutionJ105 {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] == 1){
                    result = Math.max(result,dfs(grid,i,j));
                }
            }
        }
        return result;
    }
    public int dfs(int[][] grid,int x,int y){
        if(x < 0 || x >= grid.length || y < 0  || y >= grid[0].length){
            return 0;
        }
        if(grid[x][y] == 0){
            return 0;
        }
        grid[x][y] = 0;
        
        return dfs(grid,x + 1,y) + dfs(grid,x - 1,y)
                + dfs(grid,x,y + 1) + dfs(grid,x,y - 1) + 1;
    }
}