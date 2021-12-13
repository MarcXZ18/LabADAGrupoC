public class MaxNonoverlappingSegments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1 = {3,1,4,7};
		int []arr2 = {5,2,6,9};
		
		System.out.println(solution(arr1,arr2));
	}	
	
	// dado un arreglo de enteros que indicaran el inicio
	// y final de los segmentos devolvera una cantidad
	// que indicara los conjuntos de segmentos no superpuestos
	public static int solution (int []A, int []B) {
		// si uno de los arreglos es de tamaño 1 o menor a 1
		// sera un solo segmento por lo que devolvera 0 o 1 
		if (A.length <= 1) 
			return A.length;		
		// contador para la cantidad de conjuntos de segmentos 		
		int cont = 1;
		for (int i = 1; i < A.length; i++) {
			// comparamos donde termina cada segmento con el inicio del siguiente
			// para ver si se superponen
			if (A[i] > B[i-1]) 
				cont++;					
		}
		// retornamos la cantidad que encontramos
		return cont;
	}
}
