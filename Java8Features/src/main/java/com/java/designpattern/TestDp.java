package com.java.designpattern;

public class TestDp {
	
	public static void main(String[] args) {
		TestBuilderDesignPattern pattern = new TestBuilderDesignPattern.TestBuilder()
										.setId(1)
										.setName("name")
										.build();
	}

}
