package accessSpecifier;

public class Sample6 {
public int a;

public Sample6() {
	a=20;
}
public void m1() {
	System.out.println(a);
}
	public static void main(String[] args) {
		Sample6 s = new Sample6();
		s.m1();
		new Sample6();

	}

}
