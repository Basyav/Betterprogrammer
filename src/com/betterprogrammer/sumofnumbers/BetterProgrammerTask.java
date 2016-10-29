package com.betterprogrammer.sumofnumbers;

public class BetterProgrammerTask {

	 public static int getSumOfNumbers(String s) {
	        /*
	          Please implement this method to
	          return the sum of all integers found in the parameter String. You can assume that
	          integers are separated from other parts with one or more spaces (' ' symbol).
	          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
	         */
		 s = s+" ";
		 String st = "1234567890";
		 char space = ' ';
		 int sum = 0;
		 int last = 0;
		 int first = last;
		 String subStr;
		 while (last < s.length()) {
			 last = s.indexOf(" ", first);
			 subStr = s.substring(first, last);
			 char ch = subStr.charAt(0);
			 if (st.indexOf(ch) != -1)
				 sum += Integer.parseInt(subStr);
			 last++;
			 if (last != s.length()) {
				 while ( s.charAt(last) == space )
					 last++;
			 }
			 first = last;
		 }
		 return sum;
	    }
	
	public static void main(String[] args) {
		System.out.println(getSumOfNumbers("12 s 62 some 4"));
		

	}

}
