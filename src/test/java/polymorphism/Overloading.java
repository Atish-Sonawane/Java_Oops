package polymorphism;

public class Overloading {
	int add(int a, int b) {
		return a+b;	
	}
	
	int add(int a, int b, int c) {
		return a+b+c;	
	}
	
	double add(double a, double b, double c) {
		return a+b+c;	
	}

	public static void main(String[] args) {
		Overloading calculator = new Overloading();
		int two = calculator.add(5, 4);
		int three = calculator.add(2, 30, 2);
		Double db = calculator.add(3.4, 03.4, 03);
		
		System.out.println(two+"\n"+three+"\n"+db);

	}

}
