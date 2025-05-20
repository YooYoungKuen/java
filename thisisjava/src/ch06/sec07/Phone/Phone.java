package ch06.sec07.Phone;

public class Phone {

	
	String brand;
	int series;
	String color = "검정색";
	
	Phone(String brand, String color) {
		this(brand, 24, color);
	}
	
	Phone(String brand, int series) {
		this(brand, series,"검정색");
	}
	
	Phone(String brand, int series, String color) {
		this.brand = brand;
		this.series = series;
		this.color = color;
	}
	
}
