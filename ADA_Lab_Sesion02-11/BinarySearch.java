public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,4,5,6,8,10};
		int b[] = {1,2,4,6,7,8,10};
		
		System.out.println(binSearch(a, 8));
		System.out.println(binSearch(b, 9));
		
	}
	// funcion dada un arreglo de enteros y una posicion indicada
	// se le pedira buscar en que posicion esta ubicado el
	// numero entero, en el caso que lo encuentre devuelve la posicion
	// en caso contrario devuelve -1
	public static int binSearch (int[] array, int target) {
		int L = 0;
		int R = array.length - 1;
		while (L <= R) {
			int mid = L + (R - L)/2;
			if (array[mid] == target)
				return mid;
			if (array[mid] < target)
				L = mid + 1;
			else
				R = mid - 1;			
		}
		return -1;
	}

}
