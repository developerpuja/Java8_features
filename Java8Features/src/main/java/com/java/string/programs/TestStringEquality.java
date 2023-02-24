package com.java.string.programs;

public class TestStringEquality {
	
	public static void main(String[] args) {
		String k = "Puja";
		String s = "Puja";
		
		String p = new String(k);
		String t = new String(k);

		// == checks the references and equals method checks content on the reference
		System.out.println(s==k);// true
		System.out.println(s.equals(k));// true
		System.out.println("---------------------------------------");
		System.out.println(p==k);// false
		System.out.println(s.equals(p));//true
		System.out.println("---------------------------------------");
		System.out.println(p==t); // false
		System.out.println(t.equals(p));//true
		
		testString();
		
	}
	
	private static void testString() {
		String s = "Puja";
		String s1 = s.concat(" Shingare"); // if want this modification assign new variable for this
		
		
		System.out.println(s); // String is immutable here the s prints only  "Puja"
		System.out.println(s1);
		System.out.println(s.concat(" Tendulkar"));
	}

}
