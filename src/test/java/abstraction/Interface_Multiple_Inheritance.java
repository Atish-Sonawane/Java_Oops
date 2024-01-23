package abstraction;

public class Interface_Multiple_Inheritance {

	public static void main(String[] args) {
		test obj = new test();
		obj.show();
		obj.display();

	}

}
interface I1{
	void show();    // by default public access modifier
}

interface I2{
	void display();  
}


class test implements I1, I2 {

	@Override
	public void show() {
		System.out.println("testing.....");
	}
	public void display() {
		System.out.println("testing display....");
	}
	
}
