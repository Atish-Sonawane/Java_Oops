package abstraction;

public class AbstractionDemo2 {
	public static void main(String[] args) {
		i15pro ph = new i15pro();
		ph.memory();
		ph.size();
		ph.version();
		ph.body();
		// if class is not abstract then creating object with reference of parent class, then it only called parent method.
		
		phone ph1 = new i15pro(); // in abstract both are same
		ph1.memory();
		ph1.size();
		ph1.version();
		ph.body();

	}
}

abstract class phone {
	abstract void version();
	abstract void size();
	abstract void memory();

}

abstract class iPhone extends phone { // 1st child
	@Override // if we not implement all abstract method in child then make that child as abstract class.
	void version() {
		System.out.println("it has version 4.5");
	}
}

abstract class i15 extends iPhone {   //2nd child
	@Override
	void version() {
		System.out.println("it has version 5.8");
	}

	@Override
	void memory() {
		System.out.println("it has 8 gb ram and 128 gb rom");
	}
}

class i15pro extends i15 {       // 3rd child
	@Override                    // i15pro<i15<iphone - therefore in last child all abstract method are implemented
	void size() {
		System.out.println("display is 6.7 inch");
	}
		void body() {
			System.out.println("metal body");
	}
}
