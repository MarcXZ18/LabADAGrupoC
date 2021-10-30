	//Q6: Cual es la complejidad de
	int p = 0; 						            //O(1)
	for (int i = 1; p <= n; i++) { 		//p>n  k>n
		p = p + i;						          //k(k+1)/2>n		
	}                                 //k^2≅n
										                //k=n^1/2
	
	// Complejidad O(n^1/2)
