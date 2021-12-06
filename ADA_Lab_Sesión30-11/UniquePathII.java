public class UniquePathII {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]obstacle = {{0,0,0},{0,1,0},{0,0,0}};
		System.out.println(uniquePathsWithObstacles(obstacle));
	}

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0) 
            return 0;
                 
        int fila = obstacleGrid.length;
        int col = obstacleGrid[0].length;
         
        if (obstacleGrid[0][0] == 1 || obstacleGrid[fila-1][col-1] == 1) {
            return 0;
        }         
        int[] path = new int[col];
        path[0] = 1;
         
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                if (obstacleGrid[i][j] == 1) 
                    path[j] = 0;
                else if (j > 0) 
                    path[j] = path[j] + path[j-1];                
            }
        }
        return path[col - 1];    
	}
}

