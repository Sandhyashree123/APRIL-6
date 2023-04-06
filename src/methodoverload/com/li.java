package methodoverload.com;

public class li {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = ("Sandhya");
		int i = System.identityHashCode(s);
		System.out.println(i);
		
		String s1 = new String("Saurabh");
		int identityHashCode = System.identityHashCode(s1);
		System.out.println(identityHashCode);
	}

}
