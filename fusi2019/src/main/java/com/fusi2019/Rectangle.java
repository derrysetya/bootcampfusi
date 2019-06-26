package com.fusi2019;

public class Rectangle extends Shape{
	protected Double width;
	protected Double length;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Double width, Double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(Double width, Double length, String color, Boolean filled) {
		this.width = width;
		this.length = length;
		this.color = color;
		this.filled = filled;
		
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}
	
	public double getArea() {
		return this.width * this.length ;
	}
	
	public double getPerimeter() {
		return 2 * (this.width + this.length);
	}
	
	public String toString() {
		return "Rectangle[width= "+this.width+
				", length = "+this.length+
				", color = "+this.color+
				", filled = "+this.filled +
				", perimeter = "+this.getPerimeter()+" ]";
	}
}
