	//Q11: Cual es la complejidad de
	int p = 0;                        	//O(1)                      
	for (int i = 1; i < n; i=i*2) {     //O(logn)
		p++;        					            //O(1)
	}
	for (int j = 1; j < p; j=j*2) {     //O(logn)
		System.out.println(j);        	  //O(1)
	}                                 	//Ya que son ciclos separados seria solo O(logn)
	
	// Complejidad O(logn)
