//Dado un array de numeros la funcion
//calcula el mayor de estos
public class greatestNumber {
	
	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,6};
		
		System.out.println(numeroMayor(array));
	}
	
	public static int numeroMayor(int[] array) {
		int mayor = 0;
		for (int i : array){
			if (i > mayor) {
				mayor = i;	
			}
		}
		return mayor;		
	}
}
