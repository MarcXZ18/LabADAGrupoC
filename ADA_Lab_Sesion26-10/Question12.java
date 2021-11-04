
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ques12(5);
	}

	public static void ques12 (int n) {
		//Q12: Cual es la complejidad de
		for (int i = 0; i < n; i++) {                    // O(n)
			for (int j = 1; j < n; j = j*2) {        // O(nlogn)
				System.out.println(i+"."+j);     // O(1)      
			}				         // j>=n	 j=2^k
		                                                 // 2^k=n
								 // log2(2^k)=log2(n)
								 // k=log2(n)
	        // El primer ciclo es de complejidad O(n) y el segundo de O(nlogn) ya que esta adentro del otro ciclo 		
                // Complejidad O(nlogn)
		}
	}
}
