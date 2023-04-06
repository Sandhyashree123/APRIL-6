package methodoverload.com;

public class Bank {
	
	//Based on argument
	private void bankdetailss() {
		System.out.println("bankdetailss");
	}
	
	private void bankdetailss(String name) {
		System.out.println("bank name is: "+name);
	}
	private void bankdetails(String id) {
		System.out.println("Bank id is: "+id);
	}
	private void bankdetails(char gender,long phone) {
		System.out.println("Bank gender is:"+"\n"+"Bank phone no is :"+phone);
	}
	private void bankdetails(int age) {
		System.out.println("Bank employee age is:"+age);
	}
	
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.bankdetailss("hdfc");
		b.bankdetails(23);
		b.bankdetails("9036064051");
	}
	

}
