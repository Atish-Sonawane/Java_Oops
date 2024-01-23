package polymorphism;
public class Overriding {

	public static void main(String[] args) {
		base b1 = new derived(); // create object using reference of parent class.
		                         // it has access of only parent method
		b1.baseMethod();   
	}

}

class base{
	public void baseMethod(){
		System.out.println("it's a baseMethod");
	}
}
class derived extends base{
	public void derivedMethod(){
		System.out.println("it's a derivedMethod");
	}
	public void baseMethod(){
		System.out.println("it's a baseMethod1");
	}
}
