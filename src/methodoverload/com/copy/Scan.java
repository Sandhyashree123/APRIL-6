package methodoverload.com.copy;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	//	System.out.println("c");
	 //   byte a = s.nextByte();
	  //  byte b = s.nextByte();
	//	int c= a+b;
		
		System.out.println("Employee pin is" );
		short nextShort = s.nextShort();
		
		System.out.println("Employee phoneno");
		long nextLong = s.nextLong();
	
		
		System.out.println("Employee id");
		float nextFloat = s.nextFloat();
		System.out.println("Employee id");
		int nextInt = s.nextInt();

	}

}
