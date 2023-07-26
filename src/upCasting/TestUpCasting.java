package upCasting;

public class TestUpCasting {
//assigning sub-class property to super-class propeety
	public static void main(String[] args) {
		
		Father f=new Son();//upcasting formula
		//create an object of subclass with reference/datatype of super class

		f.car();
		f.money();
		f.home();
		//f.bike();//not allowed to access of sub-class method
	}

}
