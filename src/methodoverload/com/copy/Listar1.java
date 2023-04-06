package methodoverload.com.copy;

import java.util.ArrayList;
import java.util.List;

public class Listar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	List l = new ArrayList();
	//	l.add("ss");
	//	l.add(24);
	//	l.add(167890);
	//	System.out.println(l);
	//	int size = l.size();
	//	System.out.println(size);
		
		
		
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> li1 = new ArrayList<Integer>();
		
		li.add(100);
		li.add(200);
		li.add(200);
		li.add(300); //removed
		li.add(500);//add value method  if we add the value in the  in between we can see the value it is moving backward
		li1.add(500);
		li1.add(300);
		
		System.out.println(li);
		int i = li.size();
		System.out.println(i);
		
	Integer integer = li.get(1);
	System.out.println(integer);
	
	Integer remove = li.remove(2);
	System.out.println(remove);
	
	Integer set = li.set(2, 400);
	System.out.println(li);
	
	boolean contains = li.contains(100);
	System.out.println(contains);
	
	li.addAll(li1);
	System.out.println(li);
//	li.removeAll(li1);
	//System.out.println(li);
	
	li.retainAll(li1);
	System.out.println(li1);
	
	
	
	
		
	}

}
