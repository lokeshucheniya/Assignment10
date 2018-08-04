//Parent class
class Parent{                       
	void display(String name) { 						
		System.out.println("Hello "+name+"");
	}
}

//Child class
class Child extends Parent{        
	void display(int i) {      
		System.out.println("Child class "+i);
	}
}
public class FunctionOverloading {
	public static void main(String[] args) {
		Child child=new Child(); 		 // creating an object of child class
		child.display("FooBar");
		child.display(1);
	}
}
