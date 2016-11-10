package com.betterprogrammer.getcountofones;

public class BetterProgrammerTask {

	public static int getCountOfOnes(int n) {
        /*
         Please implement this method to
         return the number of '1's in the binary representation of n
         for any integer n, where n > 0

         Example: for n=6 the binary representation is '110' and the number of '1's in that
         representation is 2

        */
    	int count = 0;
        do {
            if (n % 2 == 1) {
                count++;
            }
            n = n/2;
        } while (n != 0);
        return count;
	}

	public static void main(String[] args) {
		System.out.println(getCountOfOnes(2));
	}
}
	
	
	
		
