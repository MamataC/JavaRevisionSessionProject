package polymorphism;

public class Sample2 {

	//method overloading
	//Early binding/comiple-time polymorphism
	public void add(int a,int b,int c) {
		
		System.out.println(a+b+c);
	}
	

	public void add(int a,int b) {
		
		System.out.println(a+b);
	}
	
	
}
