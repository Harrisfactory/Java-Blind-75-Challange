class Solution {
    public int numIslands(char[][] grid) {

        int island_count = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    dfs(grid, i, j);
                    island_count++;
                }
            }
            System.out.println();
        }

        return island_count;
    }

    public void dfs(char[][] grid, int i, int j) {
        //check bounds or non hit
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }

        //destroy island
        grid[i][j] = '0';

        //search all cardinal paths
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}
