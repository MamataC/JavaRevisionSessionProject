package typesOfVariable;

public class Sample1 {

	int x = 10;

	public void m1() {

		int a = 10;// local variable
		System.out.println(a);
		System.out.println(x);
	}

	public void m2() {

		int b = 20;// local variable
		System.out.println(b);
		System.out.println(x);
	}

	public static void main(String[] args) {

		Sample1 ob = new Sample1();
		ob.m1();
		ob.m2();
		//System.out.println(x);//to call npn-static global variable in static method create object of class
	}

}
