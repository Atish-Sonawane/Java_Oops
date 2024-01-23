package constructor;

public class Parameterized {
	int id;
	String name;

	Parameterized(int n, String s) {
		id = n;
		name = s;

	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Parameterized s1 = new Parameterized(5, "Tester");
		Parameterized s2 = new Parameterized(3, "Tester2");
		s1.display();
		s2.display();
	}

}
