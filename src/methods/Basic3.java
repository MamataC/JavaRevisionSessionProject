package methods;

public class Basic3 {

	public static void main(String[] args) {
		Basic3 ob = new Basic3();
		ob.m1();// calling non-static user-defined/regular method in static through object
		ob.m2();
		System.out.println("hi main method");
		System.out.println("hello main method");

	}

	//Non-static regular method
	public void m1() {

		System.out.println("m1 non-static method");
	}

	public void m2() {
		m1();//calling non-static method into non-static method 
		     //non-static to non static method calling object not required
		System.out.println("m2 non-static method");
	}
}
