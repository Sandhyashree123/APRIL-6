package methodoverload.com.copy;

public class Bankin2 implements Bankin {

	public void fixed () {
		System.out.println("5");
	}
	
	@Override
	public void Savings() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bankin2 B = new  Bankin2();
		 B.fixed();
		 B.Savings();
	}


}
