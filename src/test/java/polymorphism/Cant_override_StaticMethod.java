package polymorphism;

public class Cant_override_StaticMethod {

	public static void main(String[] args) {
		//superclass b1 = new subclass(); // static method cannot override it return the value of parent class
		//b1.baseMethod();                //so we called it Method Hiding
		
		superclass.baseMethod();         // we not need to create object to access class.
		subclass.baseMethod();           //call static method in subclass
		subclass.derivedMethod();
	}

}

class superclass {
	static void baseMethod() {
		System.out.println("it's a baseMethod");
	}
}

class subclass extends superclass {
	static void derivedMethod() {
		System.out.println("it's a derivedMethod");
	}

	static void baseMethod() {
		System.out.println("it's a baseMethod1");
	}
}