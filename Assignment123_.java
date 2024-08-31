package abhilash_Asignments;

/*"StringBuffer 
append, insert,replace,delete,
reverse,charAt,capacity,length,
substring(oneparameter),
substring
(oneparameter, 
two parameter)
"*/

public class Assignment123_ {

	public static void main(String[] args) {

		StringBuffer B1 = new StringBuffer("Automation");

		B1.append(" Testing "); // Append Method!
		System.out.println("output AppendMethod:- " + B1);

		B1.insert(0, " Wellcome "); // Insert Method!
		System.out.println("OutPut InsertMethod:- " + B1);

		B1.replace(0, 8, "Hii"); // Replace Method
		System.out.println("Output ReplaceMethod:- " + B1);

		// CharAT method
		System.out.println("output CharAtMethod: - " + B1.charAt(5));

		// Capacity
		System.out.println("output Capacity: - " + B1.capacity());

		System.out.println("output length Method: - " + B1.length());
		
		System.out.println("SubString Method :-" + B1.substring(0));
		
		System.out.println("SubString 2 parameters Method :-" + B1.substring(0, 10));

	}

}
