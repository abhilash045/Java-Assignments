package abhilash_Asignments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//WAP- Iterator in concept of Linklist?

public class Assignment110_ {

	public static void main(String[] args) {

		Queue Q1 = new LinkedList();

		Q1.add("Ramesh");
		Q1.add("Abhilash");
		Q1.add("rajesh");
		Q1.add("Venkatesh");

		Q1.add(320);

		System.out.println(Q1);

		Iterator I1 = Q1.iterator();

		while (I1.hasNext()) {
			System.out.println(I1.next());
		}

	}

}
