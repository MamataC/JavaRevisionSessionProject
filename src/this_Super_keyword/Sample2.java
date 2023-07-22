package this_Super_keyword;

public class Sample2 extends Sample1{

	//int a =10;       //global variable from super class
	  int a=20;        //global variable from same class
	 
	public void m1() {
		
		int a=30;
		System.out.println(a);//local variable from  current method
		System.out.println(this.a);//global variable from same class
		System.out.println(super.a);//global variable from super class
	}
	
	public static void main(String[] args) {
		Sample2 s2 = new Sample2();
		s2.m1();
	}
}
