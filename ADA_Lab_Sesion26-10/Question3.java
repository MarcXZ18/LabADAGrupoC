public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ques3(20);
	}
	
	// funcion dada un entero n imprimira
	// todos los numeros de dos en dos hasta
	// el menor entero cercano a n indicado
	public static void ques3 (int n) {
		//Q3: Cual es la complejidad de
		for (int i = 0; i < n; i = i+2) {     //1+n+1+n/2
			System.out.println(i);            //1*n
		}
		
		// 2+2n+n/2 = 2+5n/2
		// Complejidad O(n)
	}
}
