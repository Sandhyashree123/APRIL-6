package methodoverload.com;

public class Info1 {

	public static void main(String[] args) {
		
		String s ="education";
		
		int count =0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);

			switch(ch) 
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count ++;
			
			
		}

	}
System.out.println(" The count of vowels is: "+count);	
}

}