//Dado un array de numeros 
//si el numero es divisible entre 2 
//todos los numeros del array se sumaran por este 
public class everyOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1, 3, 4, 6, 8};
		
		every_other(array);
	}
	
	public static void every_other(int[] array) {
		for (int i = 0; i <= array.length; i++) {           
			if(i % 2 == 0) {                           
				for(int x : array) {                   
					System.out.print(array[i] + x + "\t");  
				}
				System.out.print("\n");			   
			}
		}
	}
}
//Complejidad del código
//O(n^2)
