package entities;

public class Circle extends Shape {
	private double radius;

	public Circle(Double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public Double area() {
		return Math.PI * (Math.pow(radius, 2));
	}

	@Override
	public String toString() {
		return String.format("Area of ​​the circle: %.2f", area());
	}
}
