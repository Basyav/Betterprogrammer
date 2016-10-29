package com.betterprogrammer.reversearray;

public class BetterProgrammerTask {

	public static Object[] reverseArray(Object[] a) {
        /*
          Please implement this method to
          return a new array where the order of elements has been reversed from the original
          array.
         */
		int size = a.length;
		Object[] b = new Object[size];
		int j = 0;
		for (int i = size; i > 0; i--) {
			b[j] = a[i-1];
			j++;
		}
		return b;
    }
}
	
