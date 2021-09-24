import java.util.Scanner;

public class Ej_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, array[];
		
		System.out.print("Ingrese un numero: ");
		num = sc.nextInt();
		
		array = generarArreglo(num);
		printArray(array);
		//tiempo inicial
		long tiempoInicio = System.nanoTime();			
		System.out.println(buscar(array, 65));
		//tiempo final
		long tiempoFinal = System.nanoTime();        
        	System.out.println("Tiempo: " + (tiempoFinal-tiempoInicio) + " nanosegundos.");	
		
	}

	//Dada una entrada entera retorna un arreglo en orden 
	//descendente desde el numero ingresado
	public static int[] generarArreglo (int ent) {
		int newArreglo[] = new int[ent];
		for (int i = 0; i < newArreglo.length; i++) {
			newArreglo[i] = ent;
			ent = ent - 1;
		}
		return newArreglo;
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
	
	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}	
		System.out.println();		
	}
}
