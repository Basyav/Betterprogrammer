package com.betterprogrammer.removeduplicates;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BetterProgrammerTask {

	public static int[] removeDuplicates(int[] a) {
        /*
          Please implement this method to
          remove all duplicates from the original array. Retain the order of the elements and
          always retain the first occurrence of the duplicate elements.
          For example, parameter: {2,1,2,3}, result: {2,1,3}
         */
		Set<Integer> tempSet = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			tempSet.add(a[i]);
		}
		int[] b = new int[tempSet.size()];
		int k = 0;
		for (Iterator<Integer> i = tempSet.iterator();i.hasNext();) {
			b[k] = i.next();
			k++;
		}
		return b;
	}
}
	
	
	
		
