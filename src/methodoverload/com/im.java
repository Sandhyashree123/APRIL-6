package methodoverload.com;

public class im {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Literal and immutable string is stored in inside Head memory
		//Literal String
		String s = "Sandhya";
		String s1 = "Sandhya";
		int identityHashCode = System.identityHashCode(s);
		int identityHashCode1 = System.identityHashCode(s1);
		System.out.println(identityHashCode);
		System.out.println(identityHashCode1);
		
	//Non Literal and  Mutable String
		String s2 = new String("Saurabh");
		int identityHashCode2 = System.identityHashCode(s2);
		System.out.println(identityHashCode2);
		
		String s3 = "sandhya";
		String replace = s3.replace('a', 'z');
		System.out.println(replace);
		
		String s4 = "Shrini is a software";
		System.out.println(s4);
		String[] x = s4.split(" ");
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
			
		}
	}

}
