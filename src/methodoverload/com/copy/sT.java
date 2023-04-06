package methodoverload.com.copy;

public class sT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "JAva Application";
		String[] split = s.split(s);
		System.out.println(s);
		int indexOf = s.indexOf('a');
		System.out.println(indexOf );
		
		String s1= "Java";
		boolean equals = s.equals(s1);
		System.out.println(equals);
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String substring = s.substring(2);
		System.out.println( substring);
		int compareTo = s.compareTo(s1);
		System.out.println(compareTo);
	
	}

}
