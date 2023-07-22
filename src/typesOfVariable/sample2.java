package typesOfVariable;

public class sample2 {
	static int a = 10;

	public static void m1() {
		int b = 10;
		System.out.println(a);
	}

	public static void m2() {

		System.out.println(a);

	}

	public static void main(String[] args) {

		System.out.println(a);
		m1();
		m2();

	}

}
