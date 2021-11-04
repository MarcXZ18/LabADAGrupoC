public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ques11(6);
	}
	
	// funcion dado un entero n imprimira
	// numeros desde el 1 hasta que el i sea = o
	// mayor que el entero n, tambien imprimira 
	// numeros desde el 1 y se incrementaran por 2
	// hasta que este sea igual o mayor que el
	// mayor de nuestro ciclo anterior
	public static void ques11 (int n) {
		//Q11: Cual es la complejidad de
		int p = 0;                        	//O(1)                      
		for (int i = 1; i < n; i=i*2) {     //O(logn)
			p++;                            //O(1)
			System.out.println(p);          //O(1)
		}
		for (int j = 1; j < p; j=j*2) {     //O(logn)
			System.out.println(j);          //O(1)
		}                                 	//Ya que son ciclos separados seria solo O(logn)
		
		// Complejidad O(logn)
	}

}
