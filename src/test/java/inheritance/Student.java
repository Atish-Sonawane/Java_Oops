package inheritance;

class fees{
	int fee = 15000;
}
public class Student extends fees {
	int scholership = 6000;
	int finalfee = fee - scholership;

	public static void main(String[] args) {
		Student st = new Student();
		System.out.println("fee for students is "+ st.finalfee);

	}

}
