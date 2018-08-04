
public class CheckDemo {

	public static void main(String[] args) {
		
		Check check=new Check(); //Create object of class Check
		try {
			check.disp1();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		check.disp2();
		check.disp3();
		check.disp4();

	}

}

class Check {
	//declare variables with various access modifiers
	private int a=5; 
	public int b=78;
	protected int c=23;
	int d=12;
	
	 // Method display
	private void disp1() throws Exception {		//Gives CompileTime Error : No visibility
		System.out.println(a);
	}
	
	protected void disp2() {
		System.out.println(b);
	}
	
	public void disp3() {
		System.out.println(c);
	}
	
	void disp4() {
		System.out.println(d);
	}
	
}
