package com.java.designpattern;

public class TestBuilderDesignPattern {
	
	private int id;
	private String name;
	
	
	public TestBuilderDesignPattern(TestBuilder builder) {
		  this.id = builder.id;
		  this.name = builder.name;
	}
	
	static class TestBuilder {
		private int id;
		private String name;
		
		public TestBuilder setId(int id) {
			this.id = id;
			return this;
 		}
		
		public TestBuilder setName(String name) {
			this.name = name;
			return this;
 		}
		
		
		
		public TestBuilderDesignPattern build() {
			return new TestBuilderDesignPattern(this);
		}
	}
	
	

}
