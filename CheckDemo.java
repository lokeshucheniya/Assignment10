//Use various access modifiers 
class Check {
	private int a=5; //declare variables with various access modifiers
	public int b=78;
	protected int c=23;
	int d=12;
	
	void disp() { //display private instance member
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}
public class CheckDemo {

	public static void main(String[] args) {
		
		Check check=new Check(); //Create object of class Check
		
		
		check.disp();

	}

}