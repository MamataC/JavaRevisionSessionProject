package inheritance;

public class HirarchicleInheritannnce {

	public static void main(String[] args) {

		System.out.println("....Features of Son1 which extends FatherClass.......");
		Son1 s1 = new Son1();
		s1.mobile();
		s1.car();
		s1.money();
		s1.home();

		System.out.println("....Features of Son2 which extends FatherClass.......");
		Son2 s2 = new Son2();
		s2.laptop();
		s2.car();
		s2.money();
		s2.home();
	}

}
