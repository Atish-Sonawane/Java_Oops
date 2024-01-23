package encapsulation;

public class Account1 {
	public static void main(String args[]) {
		Account a1 = new Account();
		a1.setName("Tester");
		a1.setEmail("Tester@gmail.com");
		a1.setNumber(1231231234);
		
		System.out.println(a1.getName()+"\n"+a1.getEmail()+"\n"+a1.getNumber());
		
		System.out.println(a1.getClass());
	}
	

}
