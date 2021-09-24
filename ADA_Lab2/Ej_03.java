
public class Ej_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {24, 3, 15, 6, 5, 11, 16, 8};
		insertionSort(array);		
	}
	
	//Dado un arreglo de elementos que pueden estar
	//desordenados creara otro arreglo ordenado	
	public static void insertionSort(int array[]) {
		int key, j;
		for (int i = 1; i < array.length; ++i) {
			key = array[i];
			j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j -1;
			}
			array[j + 1] = key;					
		}
		
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k]+" ");
		}	
	}
}
