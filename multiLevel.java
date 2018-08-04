
public class A {
	void A(){
		System.out.println("This is main");
	}
}



public class B extends A {
	void B(){
		A b = new B();
		b.A();
		System.out.println("This is sub class");
	}
}



public class multiLevel  {
	public static void main(String args[]) {
		B b = new B();
		b.B();
	}
}
