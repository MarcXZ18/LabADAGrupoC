public class BinarySearchMayorIgual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {2,5,6,8,10,12};
		
		System.out.println(binSearch(a, 3));
	}
	// funcion dada un arreglo de enteros y una posicion indicada
	// esta tendra que retornar el mismo numero en caso se encuentre
	// en el array o si este no es el caso devolvera el valor mayor 
	// inmediato que se encuentre en el array
	public static int binSearch (int[] array, int target) {
		int L = 0;
		int R = array.length - 1;
		while (L <= R) {
			int mid = L + (R - L)/2;
			if (array[mid] == target)
				return target;
			if (array[mid] < target)
				L = mid + 1;
			else
				R = mid - 1;			
		}
		return array[L];
	}
}
