package typesOfVariable;

public class Sample3 {

	int c=10;
	static int x=20;
	
	public static void main(String[] args) {
		
       Sample3 ob = new Sample3();
       System.out.println(ob.c);
	}

	public static void m1() {
		
		Sample3 ob = new Sample3();
		System.out.println(ob.c);
	}
	
	public void m2() {
		System.out.println(c);
	}
}
