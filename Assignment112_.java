package abhilash_Asignments;

import java.util.LinkedList;

/*"WAP in Methods of Linkedlist
addFirst, addLast, getFirst, getLast, removeFirst, removeLast, pollFirst and pollLast" */

public class Assignment112_ {

	public static void main(String[] args) {
		
		LinkedList L1 = new LinkedList();
		
		L1.add("A");
		L1.add("B");
		L1.add("C");
		
		System.out.println(L1);
		
		
		L1.addFirst("testing");   //AddFirst Method
		System.out.println("AddFirst Method:- " + L1);
		
		L1.addLast("Course");
		System.out.println("AddLast Method:- " + L1);
		
		System.out.println("GetFirst Method:- " + L1.getFirst());
		
		System.out.println("GetLast Method:-  " + L1.getLast());
		
		
		L1.removeFirst();
		System.out.println("RemoveFirst Method:- " + L1 );
		
		L1.removeLast();
		System.out.println("RemoveLast Method:- " + L1);
		
		L1.pollFirst();
		System.out.println("poleFirst Method :- " + L1);
		
		L1.pollLast();
		System.out.println("poleLast Method :- " + L1);
	}

}
