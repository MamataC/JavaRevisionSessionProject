package abstractConcreteClass;

//Abstract or incomplete class
//can not create object of the class
abstract public class Sample1 {

	// complete method

	public void m1() {

		System.out.println("method m1 completed in Abstract class");
	}

	// complete method

	public void m2() {

		System.out.println("method m2 completed in Abstract class");
	}

	// incomplete method(No body)
	abstract public void m3();// only declaration is present

	// incomplete method(No body)
	abstract public void m4();// only declaration is present
}
