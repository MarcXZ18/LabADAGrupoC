public class BinarySearchSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		System.out.println(binSearchCuad(a, 8));		
	}
	// funcion dado un arreglo de enteros y un numero a verificar
	// si es cuadrado, la funcion cada vez que se use el algoritmo de
	// mitad se multiplicara por el mismo para encontrar el numero,	
	// en caso sea igual al numero retornara true, pero si no encuentra
	// ninguna coincidencia retornara false
	public static boolean binSearchCuad (int []array, int num) {
		int L = 0;
		int R = array.length - 1;
		while (L <= R) {
			int mid = L + (R - L)/2;
			if (array[mid]*array[mid] == num)
				return true;	
			if (array[mid]*array[mid] < num)
				L = mid + 1;
			else
				R = mid - 1;			
		}		
		return false;
	}
}
