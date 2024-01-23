package constructor;

public class Default {
	int id =3;
	String name;
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		Default d1 = new Default();
		d1.display();

	}

}
