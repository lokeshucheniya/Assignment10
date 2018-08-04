
public class AA {
	public void disp() {
		System.out.println("This is parent class");
	}
}


// Class BB extends Class AA
public class BB extends AA {
	public BB() {
		super.disp();
	}
	public void disp() {
		System.out.println("This is child class 1");
	}
}

// Class CC extends Class AA
public class CC extends AA {
	public CC(){
		super.disp();
	}
	public void disp() {
		System.out.println("This is child class 2");
	}
}

//Class BB & CC extending AA
public class Hierarchical {
	public static void main(String args[]) {
		
		BB b = new BB();
		b.disp();
		
		CC c = new CC();
		c.disp();
		
	}
}
