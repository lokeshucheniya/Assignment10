

public class AA {
	public void disp() {
		System.out.println("This is parent class");
	}
}



public class BB extends AA {
	public BB() {
		super.disp();
	}
	public void disp() {
		System.out.println("This is child class 1");
	}
}


public class CC extends AA {
	public CC(){
		super.disp();
	}
	public void disp() {
		System.out.println("This is child class 2");
	}
}

public class Hierarchical {
	public static void main(String args[]) {
		
		BB b = new BB();
		b.disp();
		
		CC c = new CC();
		c.disp();
		
	}
}
