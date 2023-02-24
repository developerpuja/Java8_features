package com.java.designpattern;

public class Employee {
	
	private int id;
	private String s;
	
	public Employee( EmployeeBuilder empBuilder) {
		
	}
	
	  public static class EmployeeBuilder {
		  private int id;
		  private String s;
		  
		  public EmployeeBuilder setId(int id) {
			  this.id = id;
			  return this;
		  }
		  
		  public EmployeeBuilder setS(String s) {
			this.s = s;
			return this;
		  }  
		  
		  public Employee build() {
			return new Employee(this);
		}
	  }

}
