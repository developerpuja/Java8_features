package com.java.designpattern;

public class CarBuilderDP {
	
	   private String make;
	    private String model;
	    private int year;
	    private String color;
	    private int horsepower;

	    private CarBuilderDP(CarBuilder builder) {
	        this.make = builder.make;
	        this.model = builder.model;
	        this.year = builder.year;
	        this.color = builder.color;
	        this.horsepower = builder.horsepower;
	    }

	    public static class CarBuilder {
	        private String make;
	        private String model;
	        private int year;
	        private String color;
	        private int horsepower;

	        public CarBuilder color(String color) {
	            this.color = color;
	            return this;
	        }

	        public CarBuilder horsepower(int horsepower) {
	            this.horsepower = horsepower;
	            return this;
	        }


			public String getMake() {
				return make;
			}


			public String getModel() {
				return model;
			}

			public int getYear() {
				return year;
			}

			public CarBuilder setYear(int year) {
				this.year = year;
				return this;
				
			}

			public String getColor() {
				return color;
			}

			public CarBuilder setColor(String color) {
				this.color = color;
				return this;
			}

			public int getHorsepower() {
				return horsepower;
			}

			public CarBuilder setHorsepower(int horsepower) {
				this.horsepower = horsepower;
				return this;
			}

	        public CarBuilderDP build() {
	            return new CarBuilderDP(this);
	        }

			public CarBuilder setModel(String string) {
				this.model = string;
				return this;
			}
	    }

}
