//Parent Class A
public class A {
	void A(){
		System.out.println("This is main");
	}
}

//Class B inheriting A
public class B extends A {
	void B(){
		A b = new B();
		b.A();
		System.out.println("This is sub class");
	}
}

//Class C inheriting B
public class C extends B{
	void C(){
		B c = new C();
		c.B();
		System.out.println("This is child class");
	}
}



public class multiLevel  {
	public static void main(String args[]) {
		C c = new C();
		c.C();
	}
}

