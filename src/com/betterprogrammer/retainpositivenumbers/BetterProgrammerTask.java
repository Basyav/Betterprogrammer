package com.betterprogrammer.retainpositivenumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BetterProgrammerTask {
	
	public static int[] retainPositiveNumbers(int[] a) {
	        /*
	          Please implement this method to
	          return a new array with only positive numbers from the given array.
	          The elements in the resulting array shall be sorted in the ascending order.
	         */
		List<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			temp.add(a[i]);
		}
		for (Iterator<Integer> i = temp.iterator(); i.hasNext();) {
			int k = i.next();
			if (k <= 0) i.remove();
		}
		Collections.sort(temp);
		int result[] = new int[temp.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp.get(i);
		}
		return result; 
	}
	
	public static void main(String[] args) {
		int[] b = new int[]{1,2,-2,5,-4};
		//retainPositiveNumbers(b);
		System.out.println(retainPositiveNumbers(b));

	}

}
