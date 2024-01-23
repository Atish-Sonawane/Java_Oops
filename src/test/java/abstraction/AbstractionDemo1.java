package abstraction;

public class AbstractionDemo1 {

	public static void main(String[] args) {
		bike b = new bike();
		car c = new car();
		
		b.engine();
		b.start();
		b.noOfTyre();
		
		c.engine();
		c.start();
		c.noOfTyre();
	}
}

abstract class vehicle { // we can't create object of abstract class(can't initiate)
	abstract void engine(); // abstract method have not body

	abstract void start(); // if method is abstract then class must be abstract vice versa not true

	void noOfTyre() { // we can add concrete method in abstract class
		System.out.println("add concrete method in abstarct class");
	}
}

class bike extends vehicle { // first child
	@Override
	void engine() {
		System.out.println("150cc engine of bike"); // if we extends abstract class then class must have implement all abstract method
	}

	@Override
	void start() {
		System.out.println("start using kick");
	}
	
}

class car extends vehicle { // first child
	@Override
	 void engine() {
		System.out.println("1200cc Engine of car ");
	}

	@Override
	void start() {
		System.out.println("start using key");
	}

	void noOfTyre() {
		System.out.println("number of tyre is 4");
	}

}
