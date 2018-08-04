//Call static and non-static member functions of a class
class TestClass {
	int no = 5;
	static String Name="Sample1";
	
	int getNo() { 								//non-static member function
		this.no++;
		return no;
	}
	static String getName() { 						//static member function
		return Name;
	}
}
class StaticNonstatic {
	public static void main(String[] args) {
		
		TestClass test = new TestClass(); 				//Create an object of class TestClass
		
		//Call static and non-static member functions of class TestClass
		System.out.println("Next no is "+test.getNo());
		System.out.println("Name is "+test.getName());
	}
}
