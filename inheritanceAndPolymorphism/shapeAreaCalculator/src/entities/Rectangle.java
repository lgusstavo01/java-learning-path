package entities;

public class Rectangle extends Shape {

	private Double length;
	private Double height;

	public Rectangle(Double length, Double height) {
		this.length = length;
		this.height = height;
	}

	public Double getLength() {
		return length;
	}

	public Double getHeight() {
		return height;
	}

	@Override
	public Double area() {
		return getLength() * getHeight();
	}

	@Override
	public String toString() {
		return String.format("Area of ​​the rectangle: %.2f", area());
	}

}
