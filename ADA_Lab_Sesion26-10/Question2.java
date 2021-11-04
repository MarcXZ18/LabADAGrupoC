public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ques2(15);
	}
	
	// funcion dada un entero n imprimira
	// todos los numeros desde este hasta el 1
	// en forma descendente
	public static void ques2 (int n) {
		//Q2: Cual es la complejidad de
		for (int i = n; i > 0; i--) {      //1+n+1+n
			System.out.println(i);         //1*n
		}
		// 2+2n+n = 2+3n
		// Complejidad O(n)
	}
}

