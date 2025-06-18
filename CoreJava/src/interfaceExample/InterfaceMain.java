package interfaceExample;

class Circle implements Shape
{
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public void calculate_area() {
		System.out.println("Area of Circle : " + (pi*radius*radius));
	}
}

class Square implements Shape{
	
	double side;
	public Square(double side) {
		this.side = side;
	}
	@Override
	public void calculate_area() {
		// TODO Auto-generated method stub
		System.out.println("Area of square : " + (side * side));
	}
	
}
class Rectangle implements Shape{

	double length,breadth;
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void calculate_area() {
		System.out.println("Area of rectangle : " + (length * breadth));
		
	}
}	

class Sphere implements Shape, Shape2{

	double radius;
	public Sphere(double radius) {
		this.radius = radius;
	}
	@Override
	public void volume() {
		System.out.println("volume of sphere : " + ((4*pi*radius*radius*radius)/3));
	}

	@Override
	public void calculate_area() {
		System.out.println("Area of sphere : " + (4*pi*radius*radius));
	}
	
}


public class InterfaceMain {

	public static void main(String[] args) {
		// Shape s = new Shape(); // cannot create object to interface
		
		Shape s = new Circle(14); // Upcasting
		s.calculate_area();
		
		s = new Square(15); // Upcasting
		s.calculate_area();
		
		s= new Rectangle(10, 15); // Upcasting
		s.calculate_area();
		
		s = new Sphere(12); //Upcasting
		s.calculate_area();
		
		Shape2 s1 = new Sphere(12); //Upcasting
		s1.volume();
		
				
		Circle c = new Circle(14);
		c.calculate_area();
		
		Square sq = new Square(15);
		sq.calculate_area();
		
		Rectangle r = new Rectangle(10, 15);
		r.calculate_area();
		
		Sphere sp = new Sphere(12);
		sp.calculate_area();
		sp.volume();
		

	}

}
