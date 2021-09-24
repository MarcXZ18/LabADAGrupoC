
public class Ej_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {2,5,7,3,9};
		int pos = 6;
		System.out.println(buscar(array1, pos));
	}
	//Dado un array de elementos y una posicion retorna
	//true si encuentra el elemento y false si no
	public static boolean buscar (int array[], int pos) {	
		for (int i = 1; i < array.length; i++) {
			if (array[i] == pos)
				return true;		
		}
		return false;
	}
}
