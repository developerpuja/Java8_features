package com.java.staticclass;

public  class StaticClass {
	
	private int i;
	private String name;
	private static String STATE = "TS";
	
	public void testNonStatic () {
		
	}
	
	public static void testStatic() {
		
		
	}
	
	static class TestInnerStatic{

     public StaticClass getInstance() {
    	 return new StaticClass();
     }
     
     public void printState() {
    	 
    	 System.out.println(STATE);
     }
     
	}

}
