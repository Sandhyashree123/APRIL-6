package methodoverload.com;

public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Sandhya";
		String s1 = "Sandhya";
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
		String s2 = "Saurabh";
		boolean equalsIgnoreCase = s2.equalsIgnoreCase(s);
		System.out.println(equalsIgnoreCase);
		
		char charAt = s2.charAt(0);
		System.out.println(charAt);
		
		boolean contains = s.contains(s);
		System.out.println(contains);
		
		String s5 = "This java class";
		String[] x = s5.split(" ");
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
			
		}
		
		}
		
			
		
		

	}

	


