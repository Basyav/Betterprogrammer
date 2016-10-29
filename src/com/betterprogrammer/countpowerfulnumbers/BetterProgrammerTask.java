package com.betterprogrammer.countpowerfulnumbers;

import java.util.ArrayList;
import java.util.List;

public class BetterProgrammerTask {

	static boolean isPrime(int num) {
		for (int i = 2; i < num ; i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
	
	public static int countPowerfulNumbers(int from, int to) {
        /*
          A powerful number is a positive integer m that for every prime number p dividing m, p*p also divides m.

          (a prime number (or a prime) is a natural number that has exactly two (distinct) natural number divisors,
          which are 1 and the prime number itself, the first prime numbers are: 2, 3, 5, 7, 11, 13, ...)

          The first powerful numbers are: 1, 4, 8, 9, 16, 25, 27, 32, 36, ...

          Please implement this method to
          return the count of powerful numbers in the range [from..to] inclusively.
         */
		List<Integer> primeList = new ArrayList<Integer>();
		for (int i = 2; i <= to; i++) {
			if (isPrime(i)) primeList.add(i);
		}
		int count = 0;
		if (from == 1) {
			count++;
			from++;
		}
		for (int i = from; i <= to; i++) {
			boolean isPowerFull = false;
			for (int j = 0; j < primeList.size() && primeList.get(j) <= i; j++) {
				if (i % primeList.get(j) == 0) {
					isPowerFull = true;
					if (! (i % (primeList.get(j)*primeList.get(j)) == 0)) {
						isPowerFull = false;
						break;
					}
				}
			}
			if (isPowerFull) {
				count++;
				System.out.print(i+" ");
			}
			
		}
		return count;
		
    }
	
	public static void main(String[] args) {
		System.out.println(countPowerfulNumbers(1, 36));

	}

}
