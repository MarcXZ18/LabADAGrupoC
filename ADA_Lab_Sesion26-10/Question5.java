
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ques5(4);
	}
	
	// funcion dada un entero n imprimira
	// decimales, el entero sera hasta uno
	// menor que el n indicado y los decimales
	// siempre seran menores al i del primer ciclo
	public static void ques5 (int n) {
		//Q5: Cual es la complejidad de
		for (int i = 0; i < n; i++) { 		   // 1+n+1+n
			for (int j = 0; j < i; j++) {	   // (1+n+1+n)*n
				System.out.println(i+"."+j);   // 1*n*n
			}                           
		}
		
		// 2+2n+2n+2n^2+n^2 = 3n^2+4n+2
		// Complejidad O(n^2)
	}
}

