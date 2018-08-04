class A {
	A(){
		System.out.println("This is parent class");
	}
}
class B extends A {
	B() {
		System.out.println("This is  child class");
	}
}
public class SingleLevelInheritance {
	public static void main(String[] args) {
		A b=new B();
	}
}