	//Q8: Cual es la complejidad de	 						    
	for (int i = n; i >= 1; i = i/2) { 	 //O(logn)
		System.out.println(i);			       //i<1	k<1 i=n/(2^k)
	}                                    //n/(2^k)=1
									                     //n=2^k
										                   //log2(n)=log2(2^k)
									                     //log2(n)=k
	
	// Complejidad O(logn)
