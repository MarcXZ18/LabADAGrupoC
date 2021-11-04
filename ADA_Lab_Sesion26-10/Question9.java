public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ques9(20);
	}
	
	// funcion dada un entero n imprimira
	// los numeros desde el 0 hasta que el numero
	// al cuadrado sea mayor igual o mayor al entero n
	public static void ques9 (int n) {
		//Q9: Cual es la complejidad de
		for (int i = 0; i * i < n; i++) {         // i^2>=n  i>n^1/2
			System.out.println(i);            // k>n^1/2
		}					  // k=n^1/2	
		
		// Complejidad O(n^1/2)
	}
}

