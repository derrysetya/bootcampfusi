package com.fusi2019;

public class Square extends Shape {
	protected Double side;
	
	public Square() {
		
	}
	
	public Square(Double side, String color, Boolean filled) {
		this.side = side;
		this.color = color;
		this.filled = filled;
		
	}

	public Double getSide() {
		return side;
	}

	public void setSide(Double side) {
		this.side = side;
	}
	
	

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.side * this.side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4 * this.side;
	}
	
	public String toString() {
		return "Square[side= "+this.side+
				", color = "+this.color+
				", filled = "+this.filled +
				", perimeter = "+this.getPerimeter()+" ]";
	}
}
