//Function overriding 
class ParentClass{
	void display() {
		System.out.println("Parent class");
	}
}

class ChildClass extends ParentClass {
	ChildClass(){
		super.display();
	}
	void display() {  					//Overriding the function of parent class
		System.out.println("Child class");
	}
}

public class CheckDemo {
	public static void main(String[] args) {
		
		ParentClass parent=new ChildClass();
		
		parent.display();
		//parent.display();
	}
}
