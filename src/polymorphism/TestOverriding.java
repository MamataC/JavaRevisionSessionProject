package polymorphism;

public class TestOverriding {

	public static void main(String[] args) {
	
		Father f = new Father();
		f.car();
		f.money();
		f.home();
		
		Son s = new Son();
		s.car();
		s.money();
		s.home();

	}

}
