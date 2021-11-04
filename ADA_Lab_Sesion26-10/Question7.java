
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ques7(8);
	}
	
	// funcion dada un entero n imprimira
	// los numeros desde el 1 y se incrementara
	// por 2, todos estos numeros deberan ser
	// menores que el entero n
	public static void ques7 (int n) {
		//Q7: Cual es la complejidad de	 						    
		for (int i = 1; i < n; i = i*2) { 	    //O(logn)
			System.out.println(i);		    //i>=n	 i=2^k
		}                                           //2^k=n
						            //log2(2k)=log2(n)
							    //k=log2(n)
		
		// Complejidad O(logn)
	}
}
