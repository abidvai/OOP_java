
//Compile time POLYMORPHISM............. 

class overload{
	void add(double a, double b) {
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	void add() {
		System.out.println("Nothing to add!!!");
	}
}

public class Polymorphism {
	public static void main(String args[]) {
		overload ob = new overload();
		ob.add();
		ob.add(5.5,6.5);
		ob.add(5,10,15);
	}
}
f