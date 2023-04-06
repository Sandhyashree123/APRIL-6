package methodoverload.com;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array is similar data type
		int num [] = new int[3];
		num[0] = 100;
		num[1] = 200;
		num[1] = 400;
		
		System.out.println(num[0]);

		int num1 [] = new int[3];
		num[0] = 100;
		num[1] = 200;
		num[1] = 400;
		int len=num.length;
		System.out.println(len);
		
		
	}

}
