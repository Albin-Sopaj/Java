//Write a Rectangle class whose objects represent rectangles. 

//The internal state of a rectangle is given by the values of the base and height. 

//A rectangle must provide three operations: resize () which takes two new base 
//and height values as parameters and updates the status, 

//perimeter () which returns the perimeter and area () which returns the area. 

//Also provide a constructor who initializes the base and height of the rectangle.

//To test the class, write a TestRettangolo program that creates three rectangles 
//(objects of the Rectangle class), calculates the sum of the areas and the sum 
//of the perimeters (printing the results), resizes one of the three rectangles 
//and reprints the sums.

public class Rectangle {
	private double base;
	private double height;

	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double resize(double base, double height) {
		this.base = base;
		this.height = height;
		double updatedPerimeter = (base + height) * 2;
		double updatedArea = base * height;
		perimeter();
		return 0;
	}

	public double perimeter() {
		return (this.base + this.height) * 2;
	}

	public double area() {
		return this.base * this.height;
	}
}
