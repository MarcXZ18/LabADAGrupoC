public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ques4(4);
	}
	
	// funcion dada un entero n imprimira
	// numeros decimales pero solo desde el 0
	// hasta que el entero y el decimal sean
	// un numero menor al entero n 
	public static void ques4 (int n) {
		//Q4: Cual es la complejidad de
		for (int i = 0; i < n; i++) { 		   // 1+n+1+n
			for (int j = 0; j < n; j++) {      // (1+n+1+n)*n
				System.out.println(i+"."+j);       // 1*n*n
			}                           
		}
		
		// 2+2n+2n+2n^2+n^2 = 3n^2+4n+2
		// Complejidad O(n^2)
	}
}
