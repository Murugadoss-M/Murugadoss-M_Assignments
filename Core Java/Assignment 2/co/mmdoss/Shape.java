package co.mmdoss;

public abstract class Shape {

	public Shape() {
		// TODO Auto-generated constructor stub
	}
	abstract void draw();

}
class Line extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing a line");
	}
	
}
class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing a rectangle");
	}
	
}
class Cube extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing a cube");
	}
	
}
