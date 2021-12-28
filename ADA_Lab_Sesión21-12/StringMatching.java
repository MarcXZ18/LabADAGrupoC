public class StringMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1, cad2;
		cad1 = "p";
		cad2 = "Popup";
		searchCoincidence(cad1,cad2);
	}
	// metodo que devuelva el primer indice con el que comenzo el patron de una
  // palabra
	public static void searchCoincidence(String pattern, String word) {
		int np = 0;
		int []array = new int [10];
		int cant = 0;
		
		while (word.indexOf(pattern) > -1) {				
			np = word.indexOf(pattern);
			word = word.substring(word.indexOf(pattern) + pattern.length(),word.length());				
			array[cant] = np;
			cant++;
		}			
		for (int i=0; i<array.length; i++) {
			if (array[i]>0)
				System.out.print(array[i]+" ");
		}		
	}
}
