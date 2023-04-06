package methodoverload.com.copy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class seeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hashset Random order
		Set<Integer> si = new HashSet<Integer>();
		si.add(10);
		si.add(40);
		si.add(30);
		System.out.println(si);
		
		//Random order 
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.add(30);
		s.add(10);
		s.add(20);
		System.out.println(s);
		
		//Treeset it will print Ascending order
		Set<Integer> si1 = new TreeSet<Integer>();
		si1.add(30);
		si1.add(10);
		si1.add(20);
		System.out.println(si1);
		
	}

}
