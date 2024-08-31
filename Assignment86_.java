package abhilash_Asignments;

//WAP to remove all smaller letters in a given string  ?

public class Assignment86_ {

	public static void main(String[] args) {
		String Name = "My Name is Abhilash Pasikanti";

		System.out.println("InputString:  " + Name);

		String N1 = Name.replaceAll("[a-z]", ""); // key word "replaceall" used to remove the smaller alphabets

		System.out.println("OutPut String:   " + N1);
	}

}
