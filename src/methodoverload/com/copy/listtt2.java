package methodoverload.com.copy;

import java.util.LinkedList;
import java.util.List;

public class listtt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = new LinkedList<Integer>();
		List<Integer> li1 = new LinkedList<Integer>();
		
		li.add(20);
		li.add(30);
		li.add(30);
		li.add(40);
		li.add(0);
		li1.add(20);
		li1.add(20);
		
		
		//System.out.println(li);
		
		int si = li.size();
		System.out.println(si);
		
		boolean contains = li.contains(20);
		System.out.println(contains);
		
		li.retainAll(li1);
		System.out.println(li1);
		

int i = li.indexOf(20);
System.out.println(i);

int j = li.lastIndexOf(40);
System.out.println(j);
		}

	}


