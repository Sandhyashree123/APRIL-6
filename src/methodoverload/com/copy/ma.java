package methodoverload.com.copy;

import java.util.HashMap;
import java.util.Map;

public class ma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(10, "Selenium");
		m.put(40, "Selenium");
		m.put(20, "Java");
		m.put(20, "Java");
		
		System.out.println(m);
	}

}
