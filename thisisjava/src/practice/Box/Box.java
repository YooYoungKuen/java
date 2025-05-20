package practice.Box;

public class Box {
	
	
	
	int width;
	int length;
	int height;
	
	
	
	Box(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	


	double volume (int width, int length, int height) {
		double result = width * length * height;
		return result;
	

	}
}