package com.betterprogrammer.getuniqueelements;

import java.util.HashSet;
import java.util.Set;

public class BetterProgrammerTask {

	public static Set<Object> getUniqueElements(Set<Object> a, Set<Object> b) {
	        /*
	          Please implement this method to
	          return a set of elements that can be found only in set a or set b,
	          but not in both Sets.
	          The method should not change the content of the parameters.
	         */
		Set<Object> c = new HashSet<Object>();
	 	for (Object o: a) {
	 		if (!b.contains(o)) 
	 			c.add(o);
	 	}
		for(Object o: b) {
			if (!a.contains(o))
				c.add(o);
		}
	 	return c;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
