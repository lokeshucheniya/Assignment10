//Abstrac Class Shape with Method draw
abstract class Shape {
	abstract void draw();
}

//Polygon Class exending Class Shape
public class Polygon extends Shape {
	public void draw() {
		System.out.println("This is polygon class");
	}
}

//Triangle Class exending Class Shape
public class Triangle extends Shape {
	public void draw() {
		System.out.println("This is triangle class");
	}
}

public class ShapeDemo {
	public static void main(String args[]) {
		Shape[] shape = new Shape[3];
		shape[0] = new Triangle();
		shape[1] = new Polygon();
		shape[2] = new Circle();
		for(int i=0;i<3;i++) {			//For calling All Three Classes
			shape[i].draw();
		}
		
	}
}
