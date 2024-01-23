package abstraction;

public class Interface {

	public static void main(String[] args) {
		test1 obj = new test1();
		obj.show();
		obj.show1();

	}

}

interface A1 {
	void show();   // by default public access modifier
	void show1();  // all variable start with public static final by default
}

class test1 implements A1 {

	@Override
	public void show() {
		System.out.println("testing.....");
	}

	@Override
	public void show1() {
		System.out.println("tester..");
		
	}

}
