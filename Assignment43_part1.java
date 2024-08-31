package abhilash_Asignments;

//method overriding super keyword parameterized and non-parameterized"

class School1 {
	void English() 
	{
		System.out.println("This English1");
	}
}
class College1 extends School1 
{
	void English() 
	
	{	//Super keyWord 
		
		super.English();
		System.out.println("This is English2");
	}
}

public class Assignment43_part1 {
	public static void main(String[] args)// main method
	{
		College1 S1 = new College1();
		S1.English();                  //calling the subclass method with the help of ref variable
	}

}
