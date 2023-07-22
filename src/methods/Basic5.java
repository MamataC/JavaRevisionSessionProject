package methods;

public class Basic5 {

	public static void main(String[] args) {

		addwithoutparameter();// calling static regular method in main method
        addwithparameter(40, 20);
	}

	//without parameter
	public static void addwithoutparameter() {

		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
	}
	
	//with parameter
	public static void addwithparameter(int n1,int n2) {
		
		System.out.println(n1+n2);
	}
	
	public void mulwithparameter(int n1,int n2) {
		
		System.out.println(n1*n2);
	}
	
	public void studentdata(int rollNo,String name,float salary) {
		
	System.out.println(rollNo);
	System.out.println(name);
	System.out.println(salary);
	}
}
