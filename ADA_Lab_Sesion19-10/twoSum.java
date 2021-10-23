//Dado una array de numeros siempre que los dos
//numeros sean diferentes y algunos de los 2 sumen 10
//se mostrara true en caso contrario se mostrara false
public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		
		System.out.println(sumaDos(array));
	}
  
	public static boolean sumaDos(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i != j && array[i] + array[j] == 10) 
					return true;				
			}
		}
		return false;
	}
}
//Complejidad del codigo
//O(n^2)
