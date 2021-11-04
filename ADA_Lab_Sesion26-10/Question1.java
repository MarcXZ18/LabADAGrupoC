public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ques1(15);
	}
	// la funcion dada un entero n imprimira
	// todos los numeros desde el indicado en
	// el ciclo for hasta uno menor que el indicado
	public static void ques1 (int n) {
		//Q1: Cual es la complejidad de
		for (int i = 0; i < n; i++) {     // 1+(n+1)+n   
			System.out.println(i);        // 1*n    
		}	
		
		// 2+2n+n = 2+3n
		// se considera el termino mas significativo
		// Complejidad O(n)			
		
	}
}
