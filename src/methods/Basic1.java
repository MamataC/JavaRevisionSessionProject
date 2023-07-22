package methods;

public class Basic1 {

	// main method
	public static void main(String[] args) {

		System.out.println("hi main method");
		System.out.println("Hello main method");
		m1();// calling user defined/regular static method  
		m2();// calling user defined/regular static method 
	}

	// static-Regular Method
	public static void m1() {

		System.out.println("m1 static Regular Method");
	}

	public static void m2() {

		m1();//calling ststic method into static method
		System.out.println("m2 static Regular Method");
	}
}
