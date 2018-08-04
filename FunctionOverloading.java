
class Parent{                       //Parent class
	void display(String name) { //Parameter is of type 'String'
		System.out.println("Hello "+name+"");
	}
}
class Child extends Parent{        //Child class
	void display(int i) {      //Parameter is of type 'int'
		System.out.println("Child class "+i);
	}
}
public class FunctionOverloading {
	public static void main(String[] args) {
		Child child=new Child();  // creating an object of child class
		child.display("FooBar");
		child.display(1);
	}
}