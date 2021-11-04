
public class Question6 {

	public static void main(String[] args) {
		ques6(16);
	}

	// funcion dada un entero n y un entero p
	// creado internamente en la funcion imprimira
	// numeros consecutivos desde el 1 que aumentaran
	// su secuencia cada vez en 1
	public static void ques6 (int n) {
		//Q6: Cual es la complejidad de
		int p = 0; 						       // O(1)
		for (int i = 1; p <= n; i++) { 		   // p>n  k>n
			p = p + i;						   // k(k+1)/2>n		
			System.out.println(p);			   // k^2≅n
		}                                      // k=n^1/2   										   
		
		// Complejidad O(n^1/2)		
	}
}
