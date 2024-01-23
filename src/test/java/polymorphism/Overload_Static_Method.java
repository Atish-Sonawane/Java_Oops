package polymorphism;

public class Overload_Static_Method {
	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static double add(double a, double b, double c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		int two = Overload_Static_Method.add(5, 4);   // another syntax
		int three = Overload_Static_Method.add(2, 30, 2);
		Double db = Overload_Static_Method.add(3.4, 03.4, 03);
		
		System.out.println(two + "\n" + three + "\n" + db);
		
		Overloading calculator = new Overloading();
		int two1 = calculator.add(5, 4);
		int three1 = calculator.add(2, 30, 2);
		Double db1 = calculator.add(3.4, 03.4, 03);
		
		System.out.println(two1 + "\n" + three1 + "\n" + db1);

	}

}
