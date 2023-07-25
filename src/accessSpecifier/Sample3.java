package accessSpecifier;

public class Sample3 {

	//default access specifier accessible throughout the package not diff package
	int b;
	
	Sample3(){
		
		b=20;
	}
	void m1() {
		
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Sample3 s = new Sample3();
		s.m1();
		new Sample3();
	}
}
