package accessSpecifier;

public class sample5 {

	protected int c;
	
	protected sample5() {
	
		c=30;
	}
	
	protected void m1() {
		
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		sample5 s = new sample5();
		s.m1();
		new sample5();
	}

}
