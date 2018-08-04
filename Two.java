//Call methods of different classes using objects
class First {
	int first=1;
	//Default Constructor
	First() {  
		System.out.println("Number is "+first);
	}
	//Display Method
	public void disp() {
		System.out.println("First");
	}
}

class Second {
	int second=2;
	//Default Constructor
	Second() {  //No-args Constructor
		System.out.println("Number is "+second);
	}
	//Display Method
	public void disp() {
		System.out.println("Second");
	}
}

public class Two {

	public static void main(String[] args) {
		
		First first=new First(); 			//Object of class First
		first.disp(); 					//Calling display method
		
		Second second=new Second(); 			//Create object of class Second
		second.disp(); 					//Call display method
	}
}
