package accessSpecifier;

public class Sample1 {

	private int a;//accessible throughout the class not diff class
	
	private Sample1() {
		a=10;
	}
	
	private void m1() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Sample1 s =new Sample1();
		s.m1();
		new Sample1();
	}
}
