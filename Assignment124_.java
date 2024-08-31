package abhilash_Asignments;

//WAP with parameterized constructor in SIB,IIB Concept?

public class Assignment124_ {

	static {
		System.out.println("SIB");
	}

	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	{
		System.out.println("IIB3");
	}

	Assignment124_() {
		System.out.println("Constructor without parameterized");
	}

	Assignment124_(String Name) {
		System.out.println("Constructor Parameterized");
	}

	public static void main(String[] args) {

		System.out.println();

		Assignment124_ a1 = new Assignment124_();

		Assignment124_ a2 = new Assignment124_("Abhilash");

	}

}
