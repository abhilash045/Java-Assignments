package abhilash_Asignments;

//"method overriding"

class Teacher {
	
	void Social()
	{
		System.out.println("This is Social Subject1");
	}
}
class Teacher1  extends Teacher
{
	void Social()
	{
		System.out.println("This is social subject2");
	}
}
public class Assignment42_ {
	
	public static void main(String[] args) {
		
		Teacher T1 = new Teacher();
		Teacher T2 = new Teacher1();
		
		T1.Social();
		T2.Social();	
	}
}
