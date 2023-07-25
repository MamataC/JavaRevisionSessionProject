package accessSpecifier1;

import accessSpecifier.Sample3;
import accessSpecifier.Sample6;
import accessSpecifier.sample5;

public class Sample1 {

	public static void main(String[] args) {
		//throw visibility error default access specifier can not access outside package
	/*	Sample3 s = new Sample3();
		s.m1();
		new Sample3();*/

		//protected access specifier can not access different package but accessible using inheritance
	    //sample5 s = new sample5();
		//s.m1();
		//new sample5();
		
	    Sample6 s = new Sample6();
		s.m1();
		new Sample6();
	}
}
