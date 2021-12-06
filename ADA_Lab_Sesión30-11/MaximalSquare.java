
public class MaximalSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] matrix = {{'1','0','1','0','0'},
				{'1','0','1','1','1'},
				{'1','1','1','1','1'},
				{'1','0','0','1','0'}};
		System.out.println(maximalSquare(matrix));
	}
	// Metodo dado un array doble de 0 y 1 calculara el area
	// del cuadrado donde mas cantidad de 1 se encuentren
	public static int maximalSquare(char[][]matrix) {
		if (matrix.length == 0 || matrix[0].length == 0) 
		    return 0;        

		int filas = matrix.length;
		int cols = matrix[0].length;        
		int[][] nMatrix = new int[filas + 1][cols + 1];

		int max = 0;
		for (int i = 1; i <= filas; i++) {
		    for (int j = 1; j <= cols; j++) {
			if (matrix[i - 1][j - 1] == '1') {
			    nMatrix[i][j] = Math.min(nMatrix[i - 1][j - 1], Math.min(nMatrix[i - 1][j], nMatrix[i][j - 1])) + 1;
			    max = Math.max(nMatrix[i][j], max);
			}
			else 
			    nMatrix[i][j] = 0;	                
		    }
		}
		return max * max;
	}
}
