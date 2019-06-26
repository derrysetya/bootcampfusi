package com.fusi2019;

public class Circle extends Shape{

	protected Double radius;
	
	public Circle() {
		
	}
	
	public Circle(Double radius) {
		
	}
	
	public Circle(Double radius, String color ,Boolean filled ) {
		this.radius = radius;
		this.filled = filled;
		this.color = color;
		
	}
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double getPerimeter() {
		return Math.PI * this.radius * this.radius;
	}
	
	public String toString() {
		return "Circle[radius= "+this.radius+
				", color = "+this.color+
				", filled = "+this.filled +
				", perimeter = "+this.getPerimeter()+" ]";
	}
}
