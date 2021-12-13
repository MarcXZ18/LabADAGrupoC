public class TieRopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,3,1,1,4};
		
		System.out.println(solution(5, nums));
	}
	
	// dado un numero que sera el limite que deben tener 
	// las cuerdas y un arreglo de n enteros devolvera 
	// el numero de cuerdas maximo de longitud igual o 
	// mayor que el entero K
	public static int solution (int K, int[]A) {
		// se creo la variable entera cont para contar la cantidad de cuerdas aceptadas
		int cont = 0;
		// se creo la variable entera tam inicializada en 0
		int tam = 0;
		for (int i = 0; i < A.length; i++) {		
			// calcularemos el tamaño de cada segmento que unamos
			tam = tam + A[i]; 
			// condicional para ver si ya llegamos al valor de K
			if (tam >= K) {
				cont++;
				tam = 0;
			// devolvemos el tamaño a 0 para seguir encontrando mas segmentos	
			}
		}
		// retornamos el valor de las cantidades encontradas
		return cont;			
	}
}
