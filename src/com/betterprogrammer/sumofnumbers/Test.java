package com.betterprogrammer.sumofnumbers;

public class Test {

	public static void main(String[] args) {
		String s = "df sd k";
		StringBuilder builder = new StringBuilder(s);
		builder.replace(4, 5, "D");
		System.out.println(builder.toString());
	}

}
