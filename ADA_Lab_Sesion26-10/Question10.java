public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ques10(5);
	}
	
	// funcion dado un entero n imprimira
	// dos veces el mismo ciclo hasta un numero
	// menos al entero n
	public static void ques10 (int n) {
		//Q10: Cual es la complejidad de
		for (int i = 0; i < n; i++) {         //O(n)
			System.out.println(i);        //O(1)
		}
		for (int j = 0; j < n; j++) {         //O(n)
			System.out.println(j);        //O(1)
		}                                     //Ya que son ciclos separados seria solo O(n)		
		
		// Complejidad O(n)
	}
}
