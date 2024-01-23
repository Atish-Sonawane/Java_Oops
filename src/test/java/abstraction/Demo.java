package abstraction;

public class Demo {
	public static void main(String[] args) {
		iphone1 ph = new iphone2();
		ph.size();
		ph.version();
	    //ph.memory();       //when create a object with reference to parent class then you can't called child method
		
		iphone2 ph1 = new iphone2();
		ph1.size();
		ph1.version();
		ph1.memory();
				
	}
}

class iphone1{
	void version() {
		System.out.println("in version parent");
	}

	void size() {
		System.out.println("in size parent");
	}	
}

class iphone2 extends iphone1{
	void size() {
		System.out.println("in size child");
	}

	void memory() {
		System.out.println("in memory child");
	}
}